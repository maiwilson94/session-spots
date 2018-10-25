<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
</head>
<body>
	<h1>Welcome, ${user.username}</h1>
	
	<form action="logout">
	    <input type="submit" value="Logout" />
	</form>
	
</body>
</html>