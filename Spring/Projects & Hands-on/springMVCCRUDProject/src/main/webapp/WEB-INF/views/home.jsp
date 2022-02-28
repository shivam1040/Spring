<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h2>Hello World!</h2>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">SN</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody> <!-- taable for displaying data contents from DB -->
  <c:forEach items="${product }" var="p"> <!-- jstl way to create a table for list recieved from controller -->
    <tr>
      <th scope="row">${p.id }</th> <!-- accessing each product obj given by for each by using variable name as defined in product class -->
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td>${p.price }</td>
      <td>
      	<a href="delete/${p.id }">Delete</a>
      	<a href="update/${p.id }">Update</a>
      </td>
    </tr>
   </c:forEach>
  </tbody>
</table>
<a href="add" class="btn btn-outline-success">Add</a>
</body>
</html>
