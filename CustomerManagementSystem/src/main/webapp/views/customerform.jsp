<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script> -->
<title>Order Form</title>
</head>
<body>
	<div align="center">
		<h2>Customer Form</h2>
		<form:form action="saveCustomer" method="post" modelAttribute="customer">

			<!-- need this to associate customer id -->
			<form:hidden path="custId" />
			<table border="1" cellpadding="5">
				<tr>
					<th>customer name:</th>
					<td><form:input path="custName" /></td>
				</tr>
				<tr>
					<th>customer address :</th>
					<td><form:input path="custAddress" /></td>
				</tr>
				<tr>

					<td colspan="2" align="center"><input type="submit"
						value="save" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>