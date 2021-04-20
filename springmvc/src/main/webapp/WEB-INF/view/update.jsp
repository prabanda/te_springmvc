<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("msg");
String errorMsg = (String) request.getAttribute("errorMsg");
%>
<%int id = (int) request.getAttribute("id"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Info</title>
</head>
<body>

	<%
	if (msg != null & !msg.isEmpty()) {
	%>
	<h1 style="color: green"><%=msg%></h1>
	<%
	}
	%>

	<%
	if (errorMsg != null & !errorMsg.isEmpty()) {
	%>
	<h1 style="color: red"><%=errorMsg%></h1>
	<%
	}
	%>

	<form action="./update" method="post">
		<table>
			<tr>
				<td><label>Emp_id:</label></td>
				<td><label><%=id%></label></td>
				<td><input type="text" name="id" hidden="true"></td>
			</tr>
			<tr>
				<td><label>Emp_name:</label></td>

				<td><input type="text" name="name"></td>

			</tr>
			<tr>
				<td><label>Emp_age:</label></td>

				<td><input type="date" name="dob"></td>

			</tr>
			<tr>
				<td><label>Emp_pw:</label></td>

				<td><input type="password" name="pw"></td>

			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>