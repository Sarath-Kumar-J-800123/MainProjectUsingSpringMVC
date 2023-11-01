<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FindEmail</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body style="background-color:cyan">
<br><br><br><br><br><br><br><br><br>
<form action="findemail" method="post">
	<div class="mb-3 container" align="center">
	  <label for="exampleFormControlInput1" class="form-label" style="color:blue"><b>Email_Id:-</b></label>
	  <input type="email" class="form-control" id="exampleFormControlInput2"  placeholder="Enter Your Email_Id" pattern="/^\w+([.-]?\w+)*@(\w+[.-])+(\w{2,})$/" name="email" style="width:300px">
	</div>
	<div class="mb-3 container" align="center">
	  <input type="submit" class="btn btn-success" value="FindEmail" style="width:150px">
	  <button type="submit" class="btn btn-primary" style="width:150px">Reset</button>
	</div>
</form>
</body>
</html>