<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phone</title>
</head>
<body>
	<h1>Single phone page</h1>
	<h3> Id: <c:out value="${s.id}" /> </h3>
	<h3> Manufacturor: <c:out value="${s.manufacturer}" /> </h3>
	<h3> Model: <c:out value="${s.model}" /> </h3>
	<h3> Size: <c:out value="${s.size}" /> </h3>
	
</body>
</html>