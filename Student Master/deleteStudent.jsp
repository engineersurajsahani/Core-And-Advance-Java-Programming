<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Student</title>
</head>
<body>
    <h2>Delete Student</h2>
    <form action="deleteStudent.jsp" method="post">
        <label for="rollNo">Roll No:</label>
        <input type="text" id="rollNo" name="rollNo" required><br>

        <input type="submit" value="Delete Student">
    </form>

    <%!
        String jdbcUrl = "jdbc:mysql://localhost:3306/university";
        String jdbcUser = "your_mysql_username";
        String jdbcPassword = "your_mysql_password";
    %>

    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            String rollNo = request.getParameter("rollNo");

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

                String deleteQuery = "DELETE FROM students WHERE RollNo = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, rollNo);
                    preparedStatement.executeUpdate();
                }

                connection.close();
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        }
    %>
</body>
</html>
