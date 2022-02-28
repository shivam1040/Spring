<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- this is spring form taglib used to print errors and has several other features -->
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
  	<div class="container mt-5">
    <form action="classRef" method="post">
    
    <div class="alert alert-danger" role="alert">
    
    <form:errors path="storingClassRef.*"></form:errors> <!-- form is name of spring taglib mentioned at starting, storingClassRef is name of modelattribute tage defined for in controller1 for method call after form submission,  * denotes that all the errors if any will be captured and displayed in dom-->
  
</div>

    	<div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" name="email">
      </div>
      
      <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter email" name="password">
      </div>
      
      <div class="form-group">
    <label for="street">Street</label>
    <input type="text" class="form-control" id="street" aria-describedby="emailHelp" placeholder="Enter street" name="Address.street"> <!-- here address is the class name while street is the variable inside it, convention necessary for mapping view data to class refrence type data  -->
      </div>
      
       <div class="form-group">
    <label for="country">Country</label>
    <input type="text" class="form-control" id="country" aria-describedby="emailHelp" placeholder="Enter country" name="Address.country">
      </div>
      
      <div class="form-group">
    <label for="id">id</label>
    <input type="text" class="form-control" id="id" aria-describedby="emailHelp" placeholder="Enter id" name="id">
      </div>
      
      <button type="submit" class="btn btn-success">Submit</button>
    </form>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>