<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Contacts</title>
</head>
<body>
    <h2>Contact List</h2>

    <%!
        String jdbcUrl = "jdbc:mysql://localhost:3306/telephonedirectory";
        String jdbcUser = "your_mysql_username";
        String jdbcPassword = "your_mysql_password";
    %>

    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

            String selectQuery = "SELECT * FROM contacts";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                out.println("<table border='1'>");
                out.println("<tr><th>ID</th><th>Name</th><th>Phone</th><th>Address</th></tr>");

                while (resultSet.next()) {
                    out.println("<tr>");
                    out.println("<td>" + resultSet.getInt("id") + "</td>");
                    out.println("<td>" + resultSet.getString("name") + "</td>");
                    out.println("<td>" + resultSet.getString("phone") + "</td>");
                    out.println("<td>" + resultSet.getString("address") + "</td>");
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
