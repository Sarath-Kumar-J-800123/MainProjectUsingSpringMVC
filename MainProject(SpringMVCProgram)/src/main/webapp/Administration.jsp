<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataControlPage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="background-color:aqua">
<br><br><br>
<form action="Family_Details" method="post">
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid" class="container" style="border: 10px solid #54B4D3;
  border-radius: 20px;
  padding: 5px;width:1000px;background-color:#868e96">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <div class="collapse navbar-collapse" id="mynavbar" style="background-color:blue gray">
      <ul class="navbar-nav me-auto">
        <li class="nav-item" style="background-color:black; border:2px solid indigo" >
          <a class="nav-link" href="Administration.jsp" style="color:red"><b>Home</b></a>
        </li>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <li>
          <button type="submit"  name="set" class="nav-item" style="background-color:black; border:2px solid indigo;color:Red"><b>Search_Aadhar</b></button>&nbsp;&nbsp;&nbsp;&nbsp;
        </li>
        <li>
          <button type="submit" name="get"  class="nav-item" style="background-color:black; border:2px solid indigo;color:Red"><b>Get_All_Details</b></button>&nbsp;&nbsp;&nbsp;&nbsp;
        </li>
        <li>
          <button type="submit" name="searchemail"  class="nav-item" style="background-color:black; border:2px solid indigo;color:Red"><b>Search_Email</b></button>&nbsp;&nbsp;&nbsp;&nbsp;
        </li>
        <li class="nav-item" style="background-color:black; border:2px solid indigo" >
          <a class="nav-link" href="index.jsp" style="color:red"><b>LogOut</b></a>
        </li>
      </ul>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>>>></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </div>
  </div>
</nav><br><br><br><br>
  <div class="container-fluid" class="container" style="border: 10px solid #868e96;
  border-radius: 20px;
  padding: 5px;width:400px;background-color:#54B4D3">
	<div class="form-group" align="center">
		<div style="color:red"><b>Family_Details_Register:-</b></div>
    	<button type="submit" class="btn btn-success" style="width:150px" name="insert">Insert_Details:-</button>
    </div><br><br>
    <div class="form-group" align="center">
    	<div style="color:red"><b>Family_Display_Details:-</b></div>
    	<button type="submit" class="btn btn-primary" style="width:150px" name="show">Show_Details:-</button>
    </div>
</div>
</form>
</body>
</html>
