<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="welcome">Home</a>
<h2>Change Password</h2>
${msg}
<form:form action="/changepassword" method="Post" modelAttribute="password">

<table>
			<tr>
				<th>Email:</th>
				<td>${email}</td>
			</tr>
			<tr>
				<th>Temp-Password:</th>
				<td><form:input path="userPazzword" /></td>
			</tr>
			<tr>
				<th>New-Password:</th>
				<td><form:input path="newPazzword" />
				</td>
			</tr>
			<tr>
				<th>ReEnter-Password:</th>
				<td><form:input path="reenterPazzword" />
				</td>
			</tr> 
			<tr>
				<th></th>
				<td><input type="submit"
					value="submit" /></td>
			</tr>
		</table>
</form:form>

</body>
</html>