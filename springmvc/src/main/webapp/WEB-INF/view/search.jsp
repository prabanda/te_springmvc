<%@page import="com.te.springmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
EmployeeBean bean = (EmployeeBean) request.getAttribute("data");
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
		<%
		if (msg != null && !msg.isEmpty()) {
		%>
		<%=msg%>
		<%
		}
		%>
</h1>
<form action="./search" method="get">
			<table>
				<tr>
					<td>Enter Id</td>
					<td>:</td>
					<td><input type="number" name="id">
				</tr>
				<tr>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
			<%
		if (bean != null) {
		%>
		<h4>
			Name :
			<%=bean.getName()%></h4>
		<h4>
			Id :
			<%=bean.getId()%></h4>
		<h4>
			Dob :
			<%=bean.getDob()%></h4>
		<%
		}
		%>
		</form>
		

</body>
</html>