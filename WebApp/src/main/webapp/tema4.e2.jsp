<!DOCTYPE html>
<html>
	<head>
		<title>Informati introduse</title>
	</head>
	<body> 
		<%
		String result;
		if(Integer.valueOf(request.getParameter("nr1"))%2==0)
			result = "par";
		else
			result = "impar";

		%>
		<div>
			Result: <b> <%= result %> </b>
		</div>
	</body>
</html>