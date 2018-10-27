<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Add Session Spot Page</title>
</head>

<body>
	<div id="addSessionBox" class="container">
		<h1>Add Session Spot</h1>
		
		<form:form commandName="sessionspot">
			<table>
				<tr>
					<td><p>Session Name:</p><td>
				</tr>
				<tr>
					<td><form:input path="name" class="formInput" placeholder="Enter Session Name" required="required" autofocus="autofocus" /></td>
				</tr>
				<tr>
					<td><p>Address:</p><td>
				</tr>
				<tr>
					<td><form:input path="address" class="formInput" placeholder="Enter Address" required="required" /></td>
				</tr>
				<tr>
					<td><p>Price:</p><td>
				</tr>
				<tr>
					<td><form:input path="price" class="formInput" placeholder="Enter Price" required="required" /></td>
				</tr>
				<tr>
					<td><p>Max Size:</p><td>
				</tr>
				<tr>
					<td><form:input path="maxSize" class="formInput" placeholder="Enter Max Size" required="required" /></td>
				</tr>
				<tr>
					<td><p>Start Datetime:</p><td>
				</tr>
				<tr>
					<td><form:input path="startDatetime" class="formInput" placeholder="Enter Start Datetime" required="required" /></td>
				</tr>
				<tr>
					<td><p>End Datetime:</p><td>
				</tr>
				<tr>
					<td><form:input path="endDatetime" class="formInput" placeholder="Enter End Datetime" required="required" /></td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="Submit" value="Add Session">
						<input type="button" onclick="location.href='index.html';" value="Home" />
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>

</html>