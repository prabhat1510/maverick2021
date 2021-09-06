<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.Date" %>


<%@ page errorPage="error.jsp"%> 
<%@ include file="header.jsp"%> <!-- Static include -->
<jsp:include page="header.jsp"> <!-- Dynamic include -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tagliburi="WEB-INF/" prefix="prefix for our custom tag" %>
<!--  Decalration Tag this tag is placed outside the _jspService method . It creates only one object for multiple requests-->
<%! %>
<!-- Expression tag -->
<%="Current time is "+ java.util.Calendar.getInstance().getTime() + request.getParameter("nameOfServer") %>
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
</tr>
</table>
</form>
</body>
</html>



