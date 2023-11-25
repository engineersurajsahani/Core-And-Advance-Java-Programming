<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change of Study Center Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        form {
            width: 50%;
            margin: auto;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input, select, textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <h2>Change of Study Center Application Form</h2>
    <form action="submitApplication.jsp" method="post">
        <label for="name">Full Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId" required>

        <label for="currentCenter">Current Study Center:</label>
        <input type="text" id="currentCenter" name="currentCenter" required>

        <label for="newCenter">New Study Center:</label>
        <input type="text" id="newCenter" name="newCenter" required>

        <label for="reason">Reason for Change:</label>
        <textarea id="reason" name="reason" rows="4" required></textarea>

        <label for="contactNumber">Contact Number:</label>
        <input type="tel" id="contactNumber" name="contactNumber" required>

        <input type="submit" value="Submit Application">
    </form>
</body>
</html>
