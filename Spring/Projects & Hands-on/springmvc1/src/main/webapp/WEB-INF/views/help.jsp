<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
<%
String name=(String)request.getAttribute("name1"); //getting data from controller class using context
%>
<h1>Help is <%=name%></h1>
</body>
</html>