<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Song edit</title>
</head>
<body>
<form:form method="post"
	action="${pageContext.request.contextPath}/song/edit"
	modelAttribute="song">
	
	<label for="id">Id</label>
	<form:input path="id"/><br/>
	
	<label for="title">Title</label>
	<form:input path="title"/><br/>
	
	<label for="author">Author</label>
	<form:input path="author"/><br/>
	
	<label for="linkMusicSheet">Link Music Sheet</label>
	<form:input path="linkMusicSheet"/><br/>
	
	<label for="verses">Verses</label>
	<form:input path="verses"/><br/>
	
	
	<label for="nrVotes">Nr Votes</label>
	<form:input path="nrVotes"/><br/>
	
	<input type="submit" value="save">
</form:form>
	
</body>
</html>