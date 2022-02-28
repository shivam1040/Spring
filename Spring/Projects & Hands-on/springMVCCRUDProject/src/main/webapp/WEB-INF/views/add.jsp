<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %> <!-- this will take the boiler plate and initial content from another jsp page -->
</head>
<body>

<form action="handle" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Product Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="name" aria-describedby="emailHelp" placeholder="Enter name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Description</label>
    <input type="text" class="form-control" name="description" id="exampleInputPassword1" placeholder="Enter Description">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword2">Price</label>
    <input type="text" class="form-control" name="price" id="exampleInputPassword2" placeholder="Enter Price">
  </div>
  
  <div class="container">
  	<a href="${pageContext.request.contextPath }/" class="btn">Back</a> <!-- this expression takes the name of project folder until this jsp, adds slash to it and calls that url when back is hit, basically previous url visited -->
  	  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>

</body>
</html>