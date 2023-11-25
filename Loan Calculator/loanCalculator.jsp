<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Calculator</title>
</head>
<body>
    <h2>Loan Calculator</h2>
    <form action="loanCalculator.jsp" method="post">
        <label for="principal">Principal Loan Amount:</label>
        <input type="text" id="principal" name="principal" required><br>

        <label for="years">Period of Time (in years):</label>
        <input type="text" id="years" name="years" required><br>

        <input type="submit" value="Calculate">
    </form>

    <%!
        double calculatePayment(double principal, double annualInterestRate, int years) {
            double monthlyInterestRate = annualInterestRate / 1200.0;
            int numberOfPayments = years * 12;

            double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            return monthlyPayment;
        }
    %>

    <%!
        void displayLoanSchedule(double principal, double annualInterestRate, int years) {
            double monthlyInterestRate = annualInterestRate / 1200.0;
            int numberOfPayments = years * 12;

            double monthlyPayment = calculatePayment(principal, annualInterestRate, years);

            out.println("<h3>Loan Schedule</h3>");
            out.println("<table border='1'>");
            out.println("<tr><th>Payment</th><th>Payment Amount</th><th>Loan Balance</th><th>Interest Paid</th></tr>");

            for (int paymentNumber = 1; paymentNumber <= numberOfPayments; paymentNumber++) {
                double interestPaid = principal * monthlyInterestRate;
                double principalPaid = monthlyPayment - interestPaid;
                principal -= principalPaid;

                out.println("<tr>");
                out.println("<td>" + paymentNumber + "</td>");
                out.println("<td>" + String.format("%.2f", monthlyPayment) + "</td>");
                out.println("<td>" + String.format("%.2f", principal) + "</td>");
                out.println("<td>" + String.format("%.2f", interestPaid) + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        }
    %>

    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            double principal = Double.parseDouble(request.getParameter("principal"));
            int years = Integer.parseInt(request.getParameter("years"));

            out.println("<h3>Loan Details</h3>");
            out.println("<p>Principal Loan Amount: $" + String.format("%.2f", principal) + "</p>");
            out.println("<p>Period of Time (in years): " + years + " years</p>");

            // Calculate and display loan schedule for each interest rate
            displayLoanSchedule(principal, 5.35, years);
            displayLoanSchedule(principal, 5.5, years);
            displayLoanSchedule(principal, 5.75, years);
        }
    %>
</body>
</html>
