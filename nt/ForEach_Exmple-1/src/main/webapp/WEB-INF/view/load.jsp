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
<h1>hello</h1>
<form:form action="#" method="Post" modelAttribute="Student">
<table>
			<tr>
				<th>Temp-Password:</th>
				<td><form:input path="studentId" /></td>
			</tr>
			<tr>
				<th>New-Password:</th>
				<td><form:input path="studentName" />
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