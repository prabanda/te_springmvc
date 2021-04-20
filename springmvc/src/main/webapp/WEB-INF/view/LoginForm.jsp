<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>LOGIN FORM</legend>
		<!--  <form action="" method="">  -->
		 <form action="./login2" method="post"> 
			<table>
				<tr>
					<td>Enter UserName</td>
					<td><input type="text" name="user"></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>

					<td><input type="submit" name="login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
