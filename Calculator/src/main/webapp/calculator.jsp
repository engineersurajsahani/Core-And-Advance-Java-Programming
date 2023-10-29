<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
    <!-- Include Bootstrap CSS -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css" integrity="sha384-nNxf4huy5Yb2YjPhf6JX/OWj8MCxx+Ogmm8kvS2WZP+ia7R4YPCVgGkLyspbhK7"
        crossorigin="anonymous">
    <style>
        /* Custom CSS for adding margin */
        .calculator-form {
            margin: 20px;
        }
    </style>
</head>
<body>
    <!-- Navbar with a primary background color -->
    <nav class="navbar navbar-expand-lg navbar-primary bg-primary">
        <div class="container">
            <a class="navbar-brand text-light" href="#">Simple Calculator</a>
        </div>
    </nav>

    <div class="container">
        <div class="calculator-form border p-4">
            <h1>Simple Calculator</h1>
            <form action="CalculatorServlet" method="post" class="mt-5">
                <div class="form-group">
                    <label for="num1">Enter the first number:</label>
                    <input type="text" class="form-control" id="num1" name="num1">
                </div>
                <div class="form-group">
                    <label for="num2">Enter the second number:</label>
                    <input type="text" class="form-control" id="num2" name="num2">
                </div>
                <div class="form-group">
                    <label for="operator">Select operation:</label>
                    <select class="form-control" id="operator" name="operator">
                        <option value="add">Add</option>
                        <option value="subtract">Subtract</option>
                        <option value="multiply">Multiply</option>
                        <option value="divide">Divide</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary mt-5">Calculate</button>
            </form>
            <br>
            <c:if test="${not empty result}">
                <div class="alert alert-success" role="alert" class="mt-5">
                    Result: ${result}
                </div>
            </c:if>
        </div>
    </div>

    <!-- Include Bootstrap JavaScript (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.7.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
