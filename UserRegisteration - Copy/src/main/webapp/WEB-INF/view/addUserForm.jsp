<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(event) {
		$("#userEmail").blur(function() {
			$("#emailMsg").text('');
			var email = $("#userEmail").val();
			 debugger;
			$.ajax({
				type : 'GET',
				url : "getAllEmaildetails?userEmail=" + email,
				success : function(data) {
					if (data == "DUPLICATE") {
						$("#emailMsg").text("email already register");
						$("#userEmail").focus();
					}
				}

			});
		});
	});
</script>
<script type="text/javascript">
	$(document).ready(function(event) {
		$("#countryId").change(function() {
			$("#stateId").find('option').remove();
			$('<option>').val('').text('----select----').appendTo("#stateId");

			$("#cityId").find('option').remove();
			$('<option>').val('').text('----Select----').appendTo("#cityId");

			var countryId = $("#countryId").val();

			$.ajax({
				type : 'GET',
				url : "getAllStateDetails?countryId=" + countryId,
				success : function(data) {
					$.each(data, function(key, val) {
						$('<option>').val(key).text(val).appendTo("#stateId");
					});
				}
			});
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function(event) {
		$("#stateId").change(function() {
			$("#cityId").find('option').remove();
			$('<option>').val('').text('----Select----').appendTo("#cityId");
			var stateId = $("#stateId").val();

			$.ajax({
				type : 'GET',
				url : "getAllCityDetails?stateId=" + stateId,
				success : function(data) {
					$.each(data, function(key, val) {
						$('<option>').val(key).text(val).appendTo("#cityId");
					});
				}
			});
		});
	});
</script>

</head>
<body>

<a href="welcome">back</a>
	<h1>Registration Page</h1>
	<h2><font color="green">${message}</font></h2>
	<h2><font color="red">${messages}</font></h2>
	<form:form action="/addUser" method="post" modelAttribute="loadForm">
		<table>
			<tr>
				<th>User-Name:</th>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<th>User-LastName:</th>
				<td><form:input path="userLastName" /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><form:input path="userEmail" /><font color="red"><span id="emailMsg"></span></font>
				</td>
			</tr>
			<tr>
				<th>Mobile:</th>
				<td><form:input path="userPhonenumber" /></td>
			</tr>
			<tr>
				<th>Date-Of-Birth:</th>
				<td><form:input path="dateOfBirth" /></td>
			</tr>
			<tr>
				<th>Gender:</th>
				<td>Male:<form:radiobutton path="gender" value='m' /> Female:<form:radiobutton
						path="gender" value='f' />
				</td>
			</tr>
			<tr>
				<th>Country:</th>
				<td><form:select path="countryId">
						<form:option value="">----select----</form:option>
						<form:options items="${allCountrys}" />
					</form:select></td>
			</tr>
			<tr>
				<th>State:</th>
				<td><form:select path="stateId">
						<form:option value="">----select----</form:option>
						<form:options item=" " />
					</form:select></td>
			</tr>
			<tr>
				<th>City:</th>
				<td><form:select path="cityId">
						<form:option value="">----select----</form:option>
						<form:options item=" " />
					</form:select></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="Reset" /><input type="submit"
					value="save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>