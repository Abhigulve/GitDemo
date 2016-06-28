<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/logistics";
		String username = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, username,
				password);
		PreparedStatement st = conn
				.prepareStatement("insert into stock_tbl values(?,?,?,?,?)");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from stock_tbl");
		int cnt = 0;
		while (rs.next()) {
			cnt++;
		}

	
		st.setString(1, request.getParameter("prod"));
		st.setInt(2, cnt+1);
		st.setString(3, request.getParameter("loc"));
		st.setString(4, request.getParameter("man"));
		st.setInt(5, Integer.valueOf(request.getParameter("quant")));
		st.execute();
		response.sendRedirect("SupplierFinal.jsp");
	%>
</body>
</html>