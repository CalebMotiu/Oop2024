<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
</head>
<body>
	<h1>Single order page</h1>
	<h3> Id: <c:out value="${s.id}" /> </h3>
	<h3> Street name: <c:out value="${s.streetName}" /> </h3>
	<h3> Street number: <c:out value="${s.streetAdress}" /> </h3>
	<h3> Arrival date: <c:out value="${s.arrivalDate}" /> </h3>
	
</body>
</html>