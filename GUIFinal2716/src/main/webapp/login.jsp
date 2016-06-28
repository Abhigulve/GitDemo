<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@page import="com.psl.test.Client"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
		Client c = new Client();
		
		String username = request.getParameter("username");
		String password = request.getParameter("confirm_password");
		String role = request.getParameter("user_job");
		
		
		/* Login l = new Login();
		l.setUser_Id(username);
		l.setPassword(password);
		l.setRole(role);
		c.loginservice(l);
		out.println("Done...!"); */
	%>
</body>
</html>