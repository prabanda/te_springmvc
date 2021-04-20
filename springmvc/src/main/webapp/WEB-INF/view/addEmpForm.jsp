
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Header.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
String errorMsg=(String)request.getAttribute("errorMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
</head>
<body>
	
		<%
		if (msg!= null && !msg.isEmpty()) {
		%>
		<%=msg%>
		<%
		}
		%>
		<%
		if (errorMsg!= null && !errorMsg.isEmpty()) {
		%>
		<%=errorMsg%>
		<%
		}
		%>
	
	<form action="./addEmployee" method="post">
		<table>
			<tr>
				<td><label>Emp_id:</label></td>
				<td><input type="number" name="id"></td>

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
				<td><input type="submit" value="addEmployee"></td>
			</tr>

		</table>
	</form>


</body>
</html>