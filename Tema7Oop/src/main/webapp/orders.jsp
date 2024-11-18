<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Orders</title>
</head>
<body>
	<h1>Order</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>street name</th>
			<th>street number</th>
			<th>arrival date</th>
		</tr>
		<c:forEach var="phone" items="${all}">
			<tr>
				<td> <c:out value="${phone.id}" /> </td>
				<td> <c:out value="${phone.streetName}" /> </td>
				<td> <c:out value="${phone.streetAdress}" /> </td>
				<td> <c:out value="${phone.arrivalDate}" /></td>
			</tr>
		</c:forEach>
		
		
	</table>
</body>
</html>