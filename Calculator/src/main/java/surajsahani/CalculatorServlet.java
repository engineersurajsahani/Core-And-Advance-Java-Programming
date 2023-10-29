package surajsahani;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operator = request.getParameter("operator");
        int result = 0;

        if (operator.equals("add")) {
            result = num1 + num2;
        } else if (operator.equals("subtract")) {
            result = num1 - num2;
        } else if (operator.equals("multiply")) {
            result = num1 * num2;
        } else if (operator.equals("divide")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                response.getWriter().write("Error: Division by zero is not allowed!");
                return;
            }
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }
}
