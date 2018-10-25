<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">	
	<title>Session Spots Login Page</title>
  	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
  	<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" >
  	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
  	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>	
</head>

<body onload="document.loginForm.j_username.focus();">
	<div id="loginBox" class="container"> 
		<h1>Session Spots</h1>
		
		<form action="login" name="loginForm" method="POST">
			<table>
				<tr>
					<td><p>Email:</p></td>
				</tr>
				<tr>
					<td><input type="text" class="formInput" name="j_username" placeholder="Enter Email" /></td>
				</tr>
				<tr>
					<td><p>Password:</p></td>
				</tr>
				<tr>
					<td><input type="password" class="formInput" name="j_password" placeholder="Enter Password" /></td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="Submit" value="Log In">
						<input type="button" onclick="location.href='registration.html';" value="Sign Up" />
					</td>
				</tr>
			</table>
		</form>
		
		<c:if test="${not empty error}">
			<div class="errorblock">
				<div>Login Unsuccessful</div>
				<div>Caused By: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>
			</div>
		</c:if>
	</div>
</body>

</html>
