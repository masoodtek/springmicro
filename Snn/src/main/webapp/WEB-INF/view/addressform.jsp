<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${person}
<h1>Address Details</h1>
<form:form method="post" action="" modelAttribute="address">
<table>
  <tr>
    <th>Address Line 1 :</th>
    <td><form:input path="addressLine1"/></td>
  </tr>
  <tr>
    <th>Address Line 2 :</th>
    <td><form:input path="addressLine2"/></td>
  </tr>
  <tr>
    <th>State :</th>
    <td><form:input path="state"/></td>
  </tr>
   <tr>
    <th>City :</th>
    <td><form:input path="city"/></td>
  </tr>
   <tr>
    <td><form:input path="personEntity" value="${person.personId}"/></td>
  </tr>
  
   <tr>
    <td><input type="submit" value="next"/></td>
    <td><</td>

  </tr>
</table>
</form:form>
<form:form method="post" action="/loadpersonform" modelAttribute="address">
<td><input type="submit" value="previse"/>
</form:form></td>
</body>
</html>