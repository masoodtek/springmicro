<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Person Details</h1>
<form:form method="post" action="/savepersondetails" modelAttribute="person">
<table>
  <tr>
    <th>FirstName :</th>
    <td><form:input path="firstName"/></td>
  </tr>
  <tr>
    <th>LastName :</th>
    <td><form:input path="lastName"/></td>
  </tr>
  <tr>
    <th>Date-Of-Birth :</th>
    <td><form:input path="dateOfBirth"/></td>
  </tr>
   <tr>
    <th>Gender :</th>
    <td>male<form:radiobutton path="gender" value="male"/>&nbsp;female<form:radiobutton path="gender" value="female"/></td>
  </tr>
   <tr>
    <td><input type="submit" value="next"/></td>
  </tr>
</table>
</form:form>
</body>
</html>