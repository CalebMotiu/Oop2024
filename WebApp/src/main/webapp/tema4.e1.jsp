<!DOCTYPE html>
<html>
	<head>
		<title>Informati introduse</title>
	</head>
	<body> 
		
		<div>
			Result: <b> <%= Integer.valueOf(request.getParameter("nr1")) + Integer.valueOf(request.getParameter("nr2"))%> </b>
		</div>
	</body>
</html>