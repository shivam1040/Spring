<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World!</h2>

<%
String name=(String)request.getAttribute("name"); //getting data from controller class using context
List<String> list=(List<String>)request.getAttribute("list");
%>

<h1>Name is <%=name%></h1>
<h2>Name is <%=list.get(0)%></h2>
</body>
</html>
