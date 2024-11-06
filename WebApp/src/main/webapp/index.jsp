<html>

	<head>
	
	</head>
	<body>
		<% String first = request.getParameter("first"); %>
		<% String last = request.getParameter("last"); %>
		
	
		<h1> HomePage</h1>
		<p>random number = <%= Math.floor(Math.random()*100)%></p>
		<p> Name is : <b> <%= first + " " + last %> </b></p>
	
	</body>
</html>

