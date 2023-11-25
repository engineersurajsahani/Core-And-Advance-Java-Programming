<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Demo</title>
</head>
<body>

    <%@ include file="header.jsp" %>

    <!-- JSP Declaration -->
    <%!
        int totalVisitors = 1000;
    %>

    <!-- JSP Scriptlet -->
    <%
        String welcomeMessage = "Welcome to JSP Demo!";
    %>

    <!-- JSP Expression -->
    <p><%= welcomeMessage %></p>

    <!-- JSP Directive - Setting response content type -->
    <%@ page contentType="text/html;charset=UTF-8" %>

    <h3>Visitor Count: <%= totalVisitors %></h3>

    <%@ include file="footer.jsp" %>

</body>
</html>
