<%@page import="com.model.register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Done</title>
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

form {
	margin-top: 140px;
	height: 121px;
}

h2 {
	text-align: center;
}

table {
	margin-left: auto;
	margin-right: auto;
}

table, tr, td, th {
	border: 1px solid black;
	border-collapse: collapse;
}

tr, td, th {
	padding: 30px;
}
</style>
<body>

	<a href="home.jsp" class="back-to-home">Back to Home</a>
	<form action="">
		<%
		register r;
		%>
		<%
		if (!session.isNew()) {
			r = (register) session.getAttribute("data");
			session.invalidate();
		%>
		<h2>Employee Details</h2>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>SALARY</th>
				<th>MOBILE NO</th>
				<th>LOCATION</th>
			</tr>
			<tr>
				<td><%=r.getEmpID()%></td>
				<td><%=r.getEmpNAME()%></td>
				<td><%=r.getEmpSALARY()%></td>
				<td><%=r.getEmpMOBILE()%></td>
				<td><%=r.getEmpLOC()%></td>
			</tr>
		</table>
		<%
		}
		%>
	</form>
</body>
</html>