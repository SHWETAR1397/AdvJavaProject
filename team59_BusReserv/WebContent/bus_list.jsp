<%@page import="com.cdac.dto.Bus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<table align="center" >
		<% 
		List<Bus> elist = (List<Bus>)request.getAttribute("busList");
		for(Bus bs : elist){
		%>
		<tr>
			
			<td>
				<%=bs.getBus_Id()%>
			</td>
			<td>
				<%=bs.getFrom1()%>
			</td>
			<td>
				<%=bs.getTo1()%>
			</td>
			<td>
				<%=bs.getTotal_seat()%>
			</td>
			<td>
				<a href="bus_delete.htm?busId=<%=bs.getBus_Id()%>">Delete</a>
			</td>
			<td>
				<a href="bus_update_form.htm?busId=<%=bs.getBus_Id()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
</body>
</html>