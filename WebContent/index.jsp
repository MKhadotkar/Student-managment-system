<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Managment</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
	
	<h1 align="center">Student Managment System</h1><br><br>
	<div class="container">
	<table width="40%" align="center" class="table table-bordered table-striped">
	<tr>
	<th>Select Opearation</th>
	<th>Buttons</th>
	</tr>
	<tr>
	<td>ADD Student</td>
	<td><a href="add.html"><input type="button" class="btn-primary" value="Click here"></a></td>
	</tr>
	<tr>
	<td>Delete Student</td>
	<td><a href="delete.html"><input type="button" class="btn-primary" value="Click here"></a></td>
	</tr>
	<tr>
	<td>Display Students</td>
	<td><a href="display.html"><input type="button" class="btn-primary" value="Click here"></a></td>
	</tr>
	</table>
	</div>
	
	<%
		String res=(String)request.getAttribute("res");
		if(res!=null)
		{
			int d=(int)request.getAttribute("data");
			if(d==1)
			{
				if(res.equals("true"))
				{
					%>
					<script type="text/javascript">
					alert("Data added.. Task done...!!");
					</script>
					<% 
				}
				else
				{
					%>
					<script type="text/javascript">
					alert("Something went wronge...!!");
					</script>
					<%
				}
			}
			else
			{
				if(res.equals("true"))
				{
					%>
					<script type="text/javascript">
					alert("Data Deleted...Task done...!!");
					</script>
					<% 
				}
				else
				{
					%>
					<script type="text/javascript">
					alert("Something went wronge...!!");
					</script>
					<%
				}
			}
		}
	%>
</body>
</html>