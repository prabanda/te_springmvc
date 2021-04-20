<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = (String) request.getAttribute("name");
int pw = (int) request.getAttribute("pw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h1>
		Name:<%=name%></h1>
	<br>
	<hr>
	<h1>
		Password:<%=pw%>
	</h1>
</body>
</html>