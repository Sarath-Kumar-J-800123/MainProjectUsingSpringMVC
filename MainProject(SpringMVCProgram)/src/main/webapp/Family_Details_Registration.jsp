<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationPage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body style="background-color:cyan">
<div class="container" style="border: 5px solid purple;
  border-radius: 20px;
  padding: 5px;width:500px;background-color:teal">
<form action="Insert_Details" method="post">
	   <div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput1" class="form-label" style="color:blue"><b>Full_Name:</b></label>
	    <input type="text" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Name" pattern="^[A-Za-z\s]{1,}[\.]{0,1}[A-Za-z\s]{0,}$" name="name" style="width:300px" required>
	   </div>
	   <div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput2" class="form-label" style="color:blue"><b>Age:</b></label>
	    <input type="number" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Age" min="1" max="120" name="age" style="width:300px" required>
	   </div>
	   <div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput3" class="form-label" style="color:blue"><b>Aadhar_Number:</b></label>
	    <input type="number" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Aadhar_Number" min="200000000000" max="999999999999" pattern="/^\[0-9]{12}$/"  name="aadhar" style="width:300px" required>
	   </div>
	   <div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput4" class="form-label" style="color:blue"><b>Pan_Number:</b></label>
	    <input type="text" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Pan_Number" pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}" name="pan" style="width:300px" required>
	   </div>
	   <div class="mb-3 container" align="center">
	    <label for="exampleFormControlInput5" class="form-label" style="color:blue"><b>Mobile_Number:</b></label>
	    <input type="tel" class="form-control" id="exampleFormControlInput1"  placeholder="Enter Your Mobile_Number" pattern="[6-9]{1}\d{9}" name="mobile" style="width:300px" required>
	   </div>
	<div class="mb-3 container" align="center">
	  <label for="exampleFormControlInput6" class="form-label" style="color:blue"><b>Email_Id:</b></label>
	  <input type="email" class="form-control" id="exampleFormControlInput2"  placeholder="Enter Your Email_Id" pattern="/^\w+([.-]?\w+)*@(\w+[.-])+(\w{2,})$/" name="email" style="width:300px" required>
	</div>
	<div class="mb-3 container" align="center">
	  <label for="exampleFormControlInput7" class="form-label" style="color:blue"><b>City_Name:</b></label>
	  <input type="text" class="form-control" id="exampleFormControlInput3"  placeholder="Enter Your City" name="city" style="width:300px" required>
	</div>
	<div class="mb-3 container" align="center">
	  <input type="submit" class="btn btn-success" value="Save" style="width:150px">
	  <button type="submit" class="btn btn-primary" style="width:150px">Reset</button>
	</div>
</form>
</div>
</body>
</html>