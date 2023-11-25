<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Contact</title>
</head>
<body>
    <h2>Add New Contact</h2>
    <form action="addContact.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <input type="submit" value="Add Contact">
    </form>

    <%!
        String jdbcUrl = "jdbc:mysql://localhost:3306/telephonedirectory";
        String jdbcUser = "your_mysql_username";
        String jdbcPassword = "your_mysql_password";
    %>

    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

                String insertQuery = "INSERT INTO contacts (name, phone, address) VALUES (?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, phone);
                    preparedStatement.setString(3, address);
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
