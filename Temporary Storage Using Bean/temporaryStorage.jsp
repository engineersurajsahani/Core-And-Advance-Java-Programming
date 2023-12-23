
<%@ page import="java.util.ArrayList" %>
<jsp:useBean id="myBean" class="com.example.MyBean" scope="request"/>
<%
    // Set data in the bean
    myBean.setData("Hello, temporary storage using Bean!");

    // Retrieve data from the bean
    String data = myBean.getData();
%>
<html>
<head><title>Temporary Storage Using Bean</title></head>
<body>
    <h2>Data stored in Bean:</h2>
    <p><%= data %></p>
</body>
</html>
