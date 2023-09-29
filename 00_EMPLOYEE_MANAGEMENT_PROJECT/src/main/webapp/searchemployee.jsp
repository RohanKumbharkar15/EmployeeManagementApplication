<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
	margin-top: 30px;
}
</style>
<body>
	<a href="home.jsp" class="back-to-home">Back to Home</a>
	<div class="center-container">
		<h1>Search Employee</h1>
		<div class="form-container">
			<form action="searchController">
				<label for="empID">Enter Registration Number :</label> <input
					type="text" id="empID" name="empID"> <br>
				<br> <input type="submit" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>