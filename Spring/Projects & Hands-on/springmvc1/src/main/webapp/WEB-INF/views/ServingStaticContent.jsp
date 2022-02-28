<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- this tag is necessary for image locationg giving -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/style.css"/>"> <!-- way to serve css, refer to springmvc servlet for how to map resources -->
<script src="<c:url value="/resources/js/script.js"/>"></script>
<title>Insert title here</title>
</head>
<body>
<img alt="image" src="<c:url value="/resources_PublicAccess/images/LayersBwDBAndController.PNG"/>">
</body>
</html>