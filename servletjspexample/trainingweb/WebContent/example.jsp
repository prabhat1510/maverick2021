<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "trainingweb.servlet.LandingPageServlet" %>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int x; //It creates multiple object for multiple requests
Date d = new Date();
System.out.println("Current Date= "+d);
System.out.println(LandingPageServlet.getServletInfo());
		
%>
<prefix_Tag:custom_Tag></prefix_Tag:custom_Tag>
<form action="actionName" method="post">
<table style="with: 50%">
<tr>
<td> UserName</td>
<td><input type="text" name="userName" /></td>
</tr>
<td> Password </td>
<td><input type="password" name="password" /></td>
<td><a class="btn btn-danger" type="button">Add</a></td>
</tr>
</table>
</form>
</body>
</html>



