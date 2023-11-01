<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin_Login_Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="background-color:teal">
<br><br><br><br>
<div class="container" style="border: 10px solid #54B4D3;
  border-radius: 20px;
  padding: 5px;width:500px;background-color:#868e96">
  
 <form action="ControlData" class="was-validated" method="post">
 <fieldset style="color:blue">
  <legend><b><u>Admin_Login:-</u></b></legend>
    <div class="form-group" align="center">
      <label for="email"><b>Admin_Email_Id:</b></label>
      <input type="email" class="form-control" id="email" placeholder="Enter Your Email_Id" name="email" style="width:300px" pattern="/^\w+([.-]?\w+)*@(\w+[.-])+(\w{2,})$/" required>
      <div class="valid-feedback" align="center"><b>Valid.</b></div>
      <div class="invalid-feedback" align="center"><b>Please fill out this field.</b></div>
    </div>
    <div class="form-group" align="center">
      <label for="pwd"><b>Admin_Password:</b></label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter Your password" name="pswd" style="width:300px" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters" required>
      <div class="valid-feedback" align="center"><b>Valid.</b></div>
      <div class="invalid-feedback" align="center"><b>Please fill out this field.</b></div>
    </div>
    <div class="form-group form-check" align="center">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember" required> I Agree With Continue.
        <div class="valid-feedback" align="center"><b>Finish.</b></div>
        <div class="invalid-feedback" align="center"><b>Check this checkbox to continue.</b></div>
      </label>
    </div>
    <div class="form-group" align="center">
    <button type="submit" class="btn btn-success" style="width:150px">Submit</button>
    <button type="submit" class="btn btn-primary" style="width:150px">Reset</button>
    </div>
    <div>
    	<marquee width="100%" behavior="alternate" bgcolor="cyan" style="color:purple;border:2px solid black""><b>***Only Admin Can Be Login***</b></marquee>
    </div>
</fieldset>
  </form>
</div>
</body>
</html>
