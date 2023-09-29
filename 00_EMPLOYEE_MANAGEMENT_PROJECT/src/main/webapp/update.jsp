<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Account Balance</title>

<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	background-color: wheat;
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

.center-container {
	text-align: center;
}

.form-container {
	background-color: #f0f0f0;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin-top: 20px;
	display: inline-block;
}

form table {
	margin: 0 auto;
}

form table td {
	padding: 10px;
}

button {
	padding: 10px 20px;
	background-color: #0074D9;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</head>
<body>
	<a href="home.jsp" class="back-to-home">Back to Home</a>
	<div class="center-container">
		<h1>Update Account Balance</h1>
		<div class="form-container">
			<form action="updateController">
				<table>
					<tr>
						<td>Enter Employee ID :</td>
						<td><input type="text" name="empID"></td>
					</tr>
					<tr>
						<td>Enter Employee Name :</td>
						<td><input type="text" name="empNAME"></td>
					</tr>
					<tr>
						<td>Enter Employee Salary :</td>
						<td><input type="text" name="empSALARY"></td>
					</tr>
					<tr>
						<td>Enter Employee Mobile Number :</td>
						<td><input type="text" name="empMOBILE"></td>
					</tr>
					<tr>
						<td>Enter Employee Location:</td>
						<td><input type="text" name="empLOC"></td>
					</tr>
					<tr>
						<td colspan="2"><button>Update</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
