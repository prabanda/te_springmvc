<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form For Employee</title>
</head>
<body>
	<h1>
		<%
		if (msg!= null && !msg.isEmpty()) {
		%>
		<%=msg%>
		<%
		}
		%>

	</h1>
	<form action="./emplogin" method="post">
		<table>
			<tr>
				<td>Enter userid</td>
				<td><input type="text" name="id"></td>
			</tr>
			

			<tr>
				<td>Enter password</td>
				<td><input type="password" name="pw"></td>

			</tr>

			<tr>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>