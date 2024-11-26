<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song</title>
</head>
<body>
	<h1>Single song page</h1>
	<h3> Id: <c:out value="${s.id}" /> </h3>
	<h3> Title: <c:out value="${s.title}" /> </h3>
	<h3> Author: <c:out value="${s.author}" /> </h3>
	<h3> Music sheet: <c:out value="${s.linkMusicSheet}" /> </h3>
	<h3> Verses: <c:out value="${s.verses}" /> </h3>
	<h3> Nr votes: <c:out value="${s.nrVotes}" /> </h3>
	
</body>
</html>