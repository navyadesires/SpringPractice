<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List</title>
</head>
<body>
	<h2>Order Details</h2>
	<h2>${Orders.orders}</h2>
	<!-- <div align="center">
	<table border="1" cellpadding = "5">
		<caption><h2>List of Order</h2></caption>
		<tr>
			<th>OrderId </th>
			<th>OrderDate </th>
			<th>OrderValue </th>
		</tr> -->
		<c:forEach items = "${Orders.orders}" var="ord" >
		<h2>======</h2>
		<h2><c:out value= "${ord}" /></h2>
		<%-- <tr>
			<td><c:out value= "${ord.orderId}" /></td>
			<td><c:out value= "${ord.orderDate}" /></td>
			<td><c:out value= "${ord.orderValue}" /> </td>
		</tr> --%>
		</c:forEach>
<!-- 	</table> -->
		
</div>
</body>
</html>