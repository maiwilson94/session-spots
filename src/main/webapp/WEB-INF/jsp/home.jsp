<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
  	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/resources/css/datatables.min.css" rel="stylesheet" >
	
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>	
  	<script src="${pageContext.request.contextPath}/resources/js/moment.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.dataTables.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/datetime.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/home.js"></script>

</head>
<body>
	<div class="container" id="content">
		<h1>Welcome, ${user.username}</h1>
		<a class="btn btn-primary" href="logout" role="button">Logout</a>
		<!-- Trigger Add Session Modal with button -->
		<button type="button" class="btn btn-primary" data-toggle="modal" 
			data-target="#addSessionModal">Add Session</button>
		
		<!-- Add Session Modal -->
		<div id="addSessionModal" class="modal fade" role="dialog">
			<div class="modal-dialog">
			
				<div class="modal-content">
				
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Add Session Spot</h4>
					</div>
					
					<div class="modal-body">
						<form:form id="addSessionForm" commandName="sessionspot">
							<table>
								<tr>
									<td><p>Session Name:</p><td>
									<td><form:input path="name" class="formInput" placeholder="Enter Session Name" required="required" autofocus="autofocus" /></td>
								</tr>
								<tr>
									<td><p>Address:</p><td>
									<td><form:input path="address" class="formInput" placeholder="Enter Address" required="required" /></td>
								</tr>
								<tr>
									<td><p>Price:</p><td>
									<td><form:input path="price" class="formInput" placeholder="Enter Price" required="required" /></td>									
								</tr>
								<tr>
									<td><p>Max Size:</p><td>
									<td><form:input path="maxSize" class="formInput" placeholder="Enter Max Size" required="required" /></td>									
								</tr>
								<tr>
									<td><p>Start Datetime:</p><td>
									<td><form:input path="startDatetime" class="formInput" placeholder="Enter Start Datetime" required="required" /></td>									
								</tr>
								<tr>
									<td><p>End Datetime:</p><td>
									<td><form:input path="endDatetime" class="formInput" placeholder="Enter End Datetime" required="required" /></td>									
								</tr>
								<tr>
									<td><input type="submit" name="Submit" value="Add Session"></td>
								</tr>
							</table>
						</form:form>
					</div>
					
				</div>
			</div>
		</div>
		
		<div id="dataTableContent">
			<table id="sessionSpotsTable" class="display">
				<thead>
					<tr>
						<th>Name</th>
						<th>Address</th>
						<th>Start Datetime</th>
						<th>End Datetime</th>
						<th>Price</th>
						<th>Max Size</th>
					</tr>
				</thead>
			</table>
		</div>
		
	</div>
	
</body>

</html>