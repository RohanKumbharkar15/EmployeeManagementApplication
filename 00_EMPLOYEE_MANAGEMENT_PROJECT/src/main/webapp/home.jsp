<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<style>
body {
	background-color: wheat;
}

div {
	justify-content: center;
	display: flex;
	margin-top: 10%;
}

h1 {
	text-align: center;
	margin-top: 100px;
	font-size: 60px;
}

a {
	text-decoration: none;
	display: inline-block;
	border: 0.5px solid rgb(87, 54, 54);
	padding: 20px;
	margin: 20px;
	justify-content: center;
	border-radius: 10px;
	background-color: rgb(0, 128, 128);
	color: white;
	cursor: pointer;
	font-weight: bold;
}

a:hover {
	background-color: rgb(128, 128, 128);
}
</style>
<body>
	<h1>Employee Management Application</h1>
	<div>
		<a href="register.jsp">Employee Register</a> <a
			href="searchemployee.jsp">Employee Search</a> <a href="delete.jsp">Employee
			Delete</a> <a href="update.jsp">Employee Update</a> <a
			href="displayAllController">Display All Employee</a>
	</div>
</body>
</html>