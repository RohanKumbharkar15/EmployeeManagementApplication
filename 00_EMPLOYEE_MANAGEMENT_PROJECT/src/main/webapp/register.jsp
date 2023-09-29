<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register here</title>
</head>
<style>
body {
	background-color: wheat;
	width: 100%;
	height: 100%;
}

.back-to-home {
	position: absolute;
	top: 10px;
	left: 10px;
	text-decoration: none;
	background-color: #0074D9;
	color: white;
	padding: 5px 10px;
	border-radius: 5px;
}

h1 {
	text-align: center;
}

div {
	justify-content: center;
	display: flex;
	margin-top: 100px;
}

form {
	border: 1px solid black;
	border-radius: 5px;
	padding: 40px;
	background-color: antiquewhite;
}

table {
	margin-left: auto;
	margin-right: auto;
}

tr, td {
	padding: 5px;
}

button {
	padding: 5px 30px;
	background-color: rgb(7, 60, 124);
	color: white;
	font-size: 20px;
	border-radius: 15px;
}
</style>
<body>

	<a href="home.jsp" class="back-to-home">Back to Home</a>
	<div>
		<form action="registerController">
			<h1>Registration Form</h1>
			<table>
				<tr>
					<td>Employee ID</td>
					<td><input type="text" name="empID"></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empNAME"></td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td><input type="text" name="empSALARY"></td>
				</tr>
				<tr>
					<td>Employee Mobile Number</td>
					<td><input type="text" name="empMOBILE"></td>
				</tr>
				<tr>
					<td>Employee Location</td>
					<td><input type="text" name="empLOC"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;">
						<button type="submit" value="Save">Submit</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>