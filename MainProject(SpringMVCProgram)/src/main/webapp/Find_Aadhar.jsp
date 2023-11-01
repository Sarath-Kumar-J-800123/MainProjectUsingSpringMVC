<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FindAadhar</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body style="background-color:teal">
<br><br><br><br><br><br><br><br><br>
<form action="search" method="post">
	<div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput1" class="form-label" style="color:blue"><b>Aadhar_Number:-</b></label>
	    <input type="number" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Aadhar_Number" min="200000000000" max="999999999999"   name="aadhar" style="width:300px">
	</div>
	<div class="mb-3 container" align="center">
	  <input type="submit" class="btn btn-success" value="FindAadhar" style="width:150px">
	  <button type="submit" class="btn btn-primary" style="width:150px">Reset</button>
	</div>
</form>	
</body>
</html>