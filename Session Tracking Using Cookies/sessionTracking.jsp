<%@ page import="java.io.PrintWriter" %>
<%
    // Get the current session or create a new one
    HttpSession session = request.getSession(true);

    // Set session attribute
    session.setAttribute("username", "JohnDoe");

    // Create a cookie for the username
    Cookie usernameCookie = new Cookie("username", "JohnDoe");
    response.addCookie(usernameCookie);
%>
<html>
<head><title>Session Tracking Using Cookies</title></head>
<body>
    <h2>Session Tracking Using Cookies</h2>
    <p>Username stored in session: <%= session.getAttribute("username") %></p>
    <p>Username stored in cookie: <%= "JohnDoe" %></p>
</body>
</html>
