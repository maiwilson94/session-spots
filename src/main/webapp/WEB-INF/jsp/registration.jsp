<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>User Registration Page</title>
  	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
  	<link href="${pageContext.request.contextPath}/resources/css/registration.css" rel="stylesheet" >
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>	
</head>

<body>
	<div id="registrationBox" class="container"> 
		<h1>User Registration</h1>
		
		<form:form commandName="user">
			<table>
				<tr>
					<td><p>Email:</p></td>
				</tr>
				<tr>
					<td><form:input path="email" class="formInput" placeholder="Enter Email" required="required" autofocus="autofocus" /></td>
				</tr>
				<tr>
					<td><p>First Name:</p></td>
				</tr>
				<tr>
					<td><form:input path="firstName" class="formInput" placeholder="Enter First Name" required="required" /></td>
				</tr>
				<tr>
					<td><p>Last Name:</p></td>
				</tr>
				<tr>
					<td><form:input path="lastName" class="formInput" placeholder="Enter Last Name" required="required" /></td>
				</tr>
				<tr>
					<td><p>Username:</p></td>
				</tr>
				<tr>
					<td><form:input path="username" class="formInput" placeholder="Enter Username" required="required" /></td>				
				</tr>
				<tr>
					<td><p>Password:</p></td>
				</tr>	
				<tr>
					<td><form:input type="password" path="password" class="formInput" placeholder="Enter Password" required="required" /></td>
				</tr>			
				<tr>
					<td>
						<input type="submit" name="Submit" value="Register">
						<input type="button" onclick="location.href='login.html';" value="Back to Login" />
					</td>
				</tr>
			</table>
		</form:form>
		
		<c:if test="${not empty error}">
			<div class="errorblock">
				<div>Registration Unsuccessful</div>
				<div>Caused By: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
			</div>
		</c:if>
	</div>
</body>

</html>