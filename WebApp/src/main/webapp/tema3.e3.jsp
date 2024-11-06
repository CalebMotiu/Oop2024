<html>

	<head>
	
	</head>
	<body>
		<% 
		String str = "ceau ce mai faci";
		int contor = 0;
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)== 'a'  || str.charAt(i) == 'e'  || str.charAt(i)=='i'  || str.charAt(i)=='o'  || str.charAt(i)=='u')
				contor++;
		}
		%>

		
	
		<h1> HomePage</h1>
		<p>Result is: <b> <%= contor %> </b></p>
	
	</body>
</html>