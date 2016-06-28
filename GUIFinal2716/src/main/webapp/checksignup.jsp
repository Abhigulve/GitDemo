

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.psl.test.Client"%>
     <%@page import="com.psl.bean.SignUp"%>
<%@page import="com.psl.dao.SignUpImpl"%>

<%@ page import ="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password").toString();
	
		
		 Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logistics", "root", "root");
		    Statement st = con.createStatement();
		    
		    ResultSet rs;
		    rs = st.executeQuery("select  role from signup_tbl where username='" + username + "' and password='" + password + "'");
		    
		    while (rs.next()) 
		    {
		    	
		    	out.println(rs.getString(1));
		    	if(rs.getString(1).equals("Supplier"))
		    	{
		    		response.sendRedirect("SupplierFinal.jsp");
		    	}
		    	if(rs.getString(1).equals("Purchaser"))
		    	{
		    		response.sendRedirect("PurchaserTrial.jsp");
		    	} 
		    }
		    
		%>

</body>
</html>