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
${msg}
<form:form action="/changepazzword" method="Post" modelAttribute="login">
<table>
			<tr>
				<th>Email :</th>
				<td><form:input path="userEmail" /></td>
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