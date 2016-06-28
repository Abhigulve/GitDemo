<%@page import="com.psl.bean.SignUp"%>
<%@page import="com.psl.dao.SignUpImpl"%>

<%@ page import="java.sql.*"%>
<%@page import="com.psl.test.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("confirm_password");
		String role = request.getParameter("user_job");
		String email = request.getParameter("user_email");

		String shopName = request.getParameter("shopName");
		String shopLocation = request.getParameter("shop_location");
		String shopAddress = request.getParameter("shopAddress");
		String shopContact = request.getParameter("shopContact");
		String shopName1 = request.getParameter("shopName1");
		String shopAddress1 = request.getParameter("shopAddress1");
		String shopContact1 = request.getParameter("shopContact1");

		/* SignUp s = new SignUp();
		s.setFirst_Name(firstname);
		s.setLast_Name(lastname);
		s.setUsername(username);
		s.setPassword(password);
		s.setRole(role);
		s.setEmail_Id(email); */
		//out.println(role);

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/logistics", "root", "root");
		PreparedStatement p = con
				.prepareStatement("insert into signup_tbl values(?,?,?,?,?,?,?,?,?,?)");

		
		p.setString(1, username);
		p.setString(3, lastname);
		p.setString(4, email);
		p.setString(2, firstname);
		p.setString(5, password);
		p.setString(6, role);
		
			if (role.equals("Supplier")) {
				//out.println("supplier");

				/* s.setShopaddress(shopAddress);

				s.setShopname(shopName);
				s.setShopcontact(shopContact); */
				
				p.setString(7, shopName);
				p.setString(8, shopLocation);
				p.setString(9, shopAddress);
				p.setString(10, shopContact);
				p.execute();
				//rs = st.executeQuery("insert into signup_tbl values('"+firstname+"','"+lastname +"','"+username+"','"+password+"','"+role+"','"+email+"','"+firstname+"',"'+firstname+'","'+firstname+'","'+firstname+'")");
					response.sendRedirect("index.html");
			//	out.println(s.toString());

			}   else {
				/*  s.setShopaddress(shopAddress1);
				s.setShopcontact(shopContact1);
				s.setShoplocation(shopLocation);
				s.setShopname(shopName1);  */

				p.setString(7, shopName1);
				p.setString(8, shopLocation);
				p.setString(9, shopAddress1);
				p.setString(10, shopContact1);
				p.execute();
				response.sendRedirect("index.html");

			} 

			

		

		
		
	%>



</body>
</html>