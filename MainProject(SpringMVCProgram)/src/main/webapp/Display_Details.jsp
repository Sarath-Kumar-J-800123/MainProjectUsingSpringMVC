<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.util.ArrayList" %>
 <%@ page import="com.springmvcprogram.model.FamilyDetailsModel" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Display_Details</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-3">
	<table class="table table-dark table-striped table-hover table-bordered" style="border:5px solid teal" >
	    <thead>
	      <tr>
	      	<th style="color:red" align="center"><b>F_Id:</b></th>
	        <th style="color:red" align="center"><b>Full_Name:</b></th>
	        <th style="color:red" align="center"><b>Age:</b></th>
	        <th style="color:red" align="center"><b>Aadhar_Number:</b></th>
	        <th style="color:red" align="center"><b>Pan_Number:</b></th>
	        <th style="color:red" align="center"><b>Mobile_Number:</b></th>
	        <th style="color:red" align="center"><b>Email_Id:</b></th>
	        <th style="color:red" align="center"><b>City_Name:</b></th>
	        <th style="color:red" align="center"><b>...Actions...</b></th>
	      </tr>
	    </thead>
	    <%ArrayList<FamilyDetailsModel> al=(ArrayList<FamilyDetailsModel>)request.getAttribute("result"); %>
	    <tbody>
	      		<%
				for(FamilyDetailsModel fdm : al)
				{
			%>
				<tr> 
					<td><%=fdm.getFid() %></td>
					<td><%=fdm.getName() %></td>
					<td><%=fdm.getAge() %></td>
					<td><%=fdm.getAadhar() %></td>
					<td><%=fdm.getPan() %></td>
					<td><%=fdm.getMobile() %></td>
					<td><%=fdm.getEmail() %></td>
					<td><%=fdm.getCity() %></td>
					<td>
						<a href="<%= request.getContextPath() %>/edit?id=<%= fdm.getFid() %>"><b>EDIT</b></a>&nbsp;&nbsp;
						<a href="delete?id=<%= fdm.getFid() %>"><b>DELETE</b></a>
					</td>
				</tr>
			<%
				}
			%>
	    </tbody>
	  </table>
	</div>
	
	<div class="container mt-3">
		<table align="center">
			<tr>
				<td><a href="Administration.jsp" class="btn btn-primary">Home</a></td>
			</tr>
		</table>
	</div>
</body>
</html>