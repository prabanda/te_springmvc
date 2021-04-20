<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <% String msg= (String)request.getAttribute("msg"); 
   String name=(String)request.getAttribute("EmpName");
   %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><a href="./createCookie">:create cookies</a></h1>
<h1><a href="./showCookie">:show cookies</a></h1>

</body>
</html>