<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h2>Add New Student</h2>
    <form action="addStudent.jsp" method="post">
        <label for="rollNo">Roll No:</label>
        <input type="text" id="rollNo" name="rollNo" required><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="semester">Semester:</label>
        <input type="text" id="semester" name="semester" required><br>

        <label for="course">Course:</label>
        <input type="text" id="course" name="course" required><br>

        <input type="submit" value="Add Student">
    </form>

    <%!
        String jdbcUrl = "jdbc:mysql://localhost:3306/university";
        String jdbcUser = "your_mysql_username";
        String jdbcPassword = "your_mysql_password";
    %>

    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            String rollNo = request.getParameter("rollNo");
            String name = request.getParameter("name");
            String semester = request.getParameter("semester");
            String course = request.getParameter("course");

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

                String insertQuery = "INSERT INTO students (RollNo, Name, Semester, Course) VALUES (?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, rollNo);
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, semester);
                    preparedStatement.setString(4, course);
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
