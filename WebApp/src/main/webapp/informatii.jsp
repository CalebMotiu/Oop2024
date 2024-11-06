<!DOCTYPE html>
<html>
	<head>
		<title>Informati introduse</title>
	</head>
	<body> 
		<div>
			Nume: <b> <%= request.getParameter("name")%> </b>
		</div>
		
		<div>
			Prenume: <b> <%= request.getParameter("sirName")%> </b>
		</div>
		<div>
			Varsta: <b> <%= request.getParameter("age")%> </b>
		</div>
		<div>
			DOB: <b> <%= request.getParameter("dob")%> </b>
		</div>
	</body>
</html>