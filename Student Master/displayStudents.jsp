<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Students</title>
</head>
<body>
    <h2>Student List</h2>

    <%!
        String jdbcUrl = "jdbc:mysql://localhost:3306/university";
        String jdbcUser = "your_mysql_username";
        String jdbcPassword = "your_mysql_password";
    %>

    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

            String selectQuery = "SELECT * FROM students";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                out.println("<table border='1'>");
                out.println("<tr><th>Roll No</th><th>Name</th><th>Semester</th><th>Course</th></tr>");

                while (resultSet.next()) {
                    out.println("<tr>");
                    out.println("<td>" + resultSet.getString("RollNo") + "</td>");
                    out.println("<td>" + resultSet.getString("Name") + "</td>");
                    out.println("<td>" + resultSet.getString("Semester") + "</td>");
                    out.println("<td>" + resultSet.getString("Course") + "</td>");
                    out.println("</tr>");
                }

                out.println("</table>");
            }

            connection.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>
</body>
</html>
