<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored= "false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Details</h2>
	
	<div align="center">
	<table border="1" cellpadding = "5">

		<tr>
			<th>CustomerId </th>
			<th>CustomerName</th>
			<th>CustomerAddress </th>
		</tr> 
		
		<c:forEach items = "${Customers}" var="cus" >
		
		 <tr>
			<td><c:out value= "${cus.custId}" /></td>
			<td><c:out value= "${cus.custName}" /></td>
			<td><c:out value= "${cus.custAddress}" /> </td>
		</tr> 
		</c:forEach>
		
	</table> 
		
</div>
</body>
</html>