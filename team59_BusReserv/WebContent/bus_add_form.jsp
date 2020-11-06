<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bus Form</title>
</head>
<body>
	<spr:form action="bus_add.htm" method="post" commandName="bus" >
	<table align="center" >
		<tr>
			<td>
				Source :
			</td>
			<td>
				<spr:input path="from"/>
			</td>
		</tr>
		<tr>
			<td>
				Destination:
			</td>
			<td>
				<spr:input path="to"/>
			</td>
		</tr>
		<tr>
			<td>
				Date:
			</td>
			<td>
				<spr:input path="date"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>