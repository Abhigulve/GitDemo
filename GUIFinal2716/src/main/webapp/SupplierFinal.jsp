<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Theme Made By www.w3schools.com - No Copyright -->
<title>Bootstrap Theme Company Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="http://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style>
body {
	font: 400 15px Lato, sans-serif;
	line-height: 1.8;
	color: #818181;
}

h2 {
	font-size: 24px;
	text-transform: uppercase;
	color: #303030;
	font-weight: 600;
	margin-bottom: 30px;
}

h4 {
	font-size: 19px;
	line-height: 1.375em;
	color: #303030;
	font-weight: 400;
	margin-bottom: 30px;
}

.jumbotron {
	background-color: #f4511e;
	color: #fff;
	padding: 100px 25px;
	font-family: Montserrat, sans-serif;
}

.container-fluid {
	padding: 60px 50px;
}

.bg-grey {
	background-color: #f6f6f6;
}

.logo-small {
	color: #f4511e;
	font-size: 50px;
}

.logo {
	color: #f4511e;
	font-size: 400px;
}

.thumbnail {
	padding: 0 0 15px 0;
	border: none;
	border-radius: 0;
}

.thumbnail img {
	width: 100%;
	height: 100%;
	margin-bottom: 10px;
}

.carousel-control.right, .carousel-control.left {
	background-image: none;
	color: #f4511e;
}

.carousel-indicators li {
	border-color: #f4511e;
}

.carousel-indicators li.active {
	background-color: #f4511e;
}

.item h4 {
	font-size: 19px;
	line-height: 1.375em;
	font-weight: 400;
	font-style: italic;
	margin: 70px 0;
}

.item span {
	font-style: normal;
}

.panel {
	border: 1px solid #f4511e;
	border-radius: 0 !important;
	transition: box-shadow 0.5s;
}

.panel:hover {
	box-shadow: 5px 0px 40px rgba(0, 0, 0, .2);
}

.panel-footer .btn:hover {
	border: 1px solid #f4511e;
	background-color: #fff !important;
	color: #f4511e;
}

.panel-heading {
	color: #fff !important;
	background-color: #f4511e !important;
	padding: 25px;
	border-bottom: 1px solid transparent;
	border-top-left-radius: 0px;
	border-top-right-radius: 0px;
	border-bottom-left-radius: 0px;
	border-bottom-right-radius: 0px;
}

.panel-footer {
	background-color: white !important;
}

.panel-footer h3 {
	font-size: 32px;
}

.panel-footer h4 {
	color: #aaa;
	font-size: 14px;
}

.panel-footer .btn {
	margin: 15px 0;
	background-color: #f4511e;
	color: #fff;
}

.navbar {
	margin-bottom: 0;
	background-color: #f4511e;
	z-index: 9999;
	border: 0;
	font-size: 12px !important;
	line-height: 1.42857143 !important;
	letter-spacing: 4px;
	border-radius: 0;
	font-family: Montserrat, sans-serif;
}

.navbar li a, .navbar .navbar-brand {
	color: #fff !important;
}

.navbar-nav li a:hover, .navbar-nav li.active a {
	color: #f4511e !important;
	background-color: #fff !important;
}

.navbar-default .navbar-toggle {
	border-color: transparent;
	color: #fff !important;
}

footer .glyphicon {
	font-size: 20px;
	margin-bottom: 20px;
	color: #f4511e;
}

.slideanim {
	visibility: hidden;
}

.slide {
	animation-name: slide;
	-webkit-animation-name: slide;
	animation-duration: 1s;
	-webkit-animation-duration: 1s;
	visibility: visible;
}

@
keyframes slide { 0% {
	opacity: 0;
	-webkit-transform: translateY(70%);
}

100%
{
opacity
:
 
1;
-webkit-transform
:
 
translateY
(0%);

    
}
}
@
-webkit-keyframes slide { 0% {
	opacity: 0;
	-webkit-transform: translateY(70%);
}

100%
{
opacity
:
 
1;
-webkit-transform
:
 
translateY
(0%);

    
}
}
@media screen and (max-width: 768px) {
	.col-sm-4 {
		text-align: center;
		margin: 25px 0;
	}
	.btn-lg {
		width: 100%;
		margin-bottom: 35px;
	}
}

@media screen and (max-width: 480px) {
	.logo {
		font-size: 150px;
	}
}
</style>
<script src="manageStock.js"></script>
<link rel="stylesheet" href="css/profile.css">



</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-header" href="#"> <img alt="Shroo"
					src="logo_1931553_web.jpg">
				</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">


					<li><a href="index.html">LOGOUT</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="jumbotron text-center">
		<h1>Conveyor.com</h1>
		<p>Reliable Goods Carrier System</p>

	</div>
	<!--  <button id="logout" >LOGOUT</button> -->




	<div id="tabs">
		<button id="b1" class="button">View Stock</button>
		<button id="b2" class="button">Manage Stock</button>
		<button id="b3" class="button">View Orders</button>

		<button id="b4" class="button">Track Shipping</button>
	</div>




	<div class="container" style="border-radius: 8px;">
		<div class="row">


			<div class="col-md-12">
				<div class="table-responsive" id="addrowtbl" style="display: none">

					<form action="AddData.jsp">

						<table id="mytable" class="table table-bordred table-striped">

							<thead>


								<tr>
									<th colspan="6"><h4 align="center">Manage Stock</h4></th>
								</tr>
								<th>Product_Name</th>
								<th>Quantity</th>
								<th>Location</th>
								<th>Manager</th>

								<!--  <th>Edit</th> -->
								<th>Delete</th>
							</thead>
							<tbody>


								<tr class="data"></tr>
								<tr id="addr0">


									<td id="product0"><input type="text" id="product"
										name="prod" class="form-control"></td>
									<td id="quantity0"><input type="text" id="quant"
										name="quant" class="form-control"></td>
									<td id="loc0"><input type="text" name='loc'
										class="form-control"></td>
									<td id="manager0"><input type="text" name='man'
										class="form-control"></td>

									<!--  <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td> -->
									<td><p data-placement="top" data-toggle="tooltip"
											title="Delete">
											<button class="btn btn-danger btn-xs" data-title="Delete"
												data-toggle="modal" data-target="#delete">
												<span class="glyphicon glyphicon-trash"></span>
											</button>
										</p></td>
								</tr>
								<tr id="addr1">
							</tbody>

						</table>

						<button type="button" id="add_button" style="margin-left: 80%">Addrow</button> 

						<button type="submit" id="add_buttonS" style="margin-left: 80%">Add Data</button>
					</form>

				</div>

			</div>
		</div>
	</div>


	<!-- update form -->



	<div class="modal fade" id="edit" tabindex="-1" role="dialog"
		aria-labelledby="edit" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
					<h4 class="modal-title custom_align" id="Heading">Edit Your
						Detail</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<input class="form-control " type="text" placeholder="Product Id">
					</div>
					<div class="form-group">

						<input class="form-control " type="text"
							placeholder="Product Name">
					</div>
					<div class="form-group">
						<textarea rows="2" class="form-control" placeholder="Quantity"></textarea>


					</div>
					<div class="form-group">
						<textarea rows="2" class="form-control" placeholder="Location"></textarea>


					</div>
					<div class="form-group">
						<textarea rows="2" class="form-control" placeholder="Manager"></textarea>



					</div>
				</div>



				<div class="modal-footer ">
					<button type="button" class="btn btn-warning btn-lg"
						style="width: 100%;">
						<span class="glyphicon glyphicon-ok-sign"></span> Update
					</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>


	<!-- delete popup -->


	<div class="modal fade" id="delete" tabindex="-1" role="dialog"
		aria-labelledby="edit" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
					<h4 class="modal-title custom_align" id="Heading">Delete this
						entry</h4>
				</div>
				<div class="modal-body">

					<div class="alert alert-danger">
						<span class="glyphicon glyphicon-warning-sign"></span> Are you
						sure you want to delete this Record?
					</div>

				</div>
				<div class="modal-footer ">
					<button type="button" id="delete_button" class="btn btn-success"
						data-dismiss="modal">
						<span class="glyphicon glyphicon-ok-sign"></span> Yes
					</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-remove"></span> No
					</button>
				</div>
			</div>

		</div>

	</div>





	<div class="container" id="vieworder" style="display: none">
		<div class="row">
			<div class="col-md-12">

				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">

						<thead>
							<tr>
								<th colspan="6"><h4 align="center">Orders Details</h4></th>
							</tr>
							<th>Order Id</th>
							<th>Purchaser Name</th>
							<th>Product Name</th>
							<th>Quantity</th>
							<th>Total Amount</th>
							<th>Status</th>
						</thead>

						<tbody>

							<%
								Class.forName("com.mysql.jdbc.Driver");
								String url = "jdbc:mysql://localhost:3306/logistics";
								String username = "root";
								String password = "root";
								String query = "select * from purchaserorder_tbl";
								Connection conn = DriverManager.getConnection(url, username,
										password);
								Statement stmt = conn.createStatement();
								ResultSet rs = stmt.executeQuery(query);
								while (rs.next()) {
							%>

							<tr>
								<td><%=rs.getInt("order_id")%></td>
								<td><%=rs.getString("user_Name")%></td>
								<td><%=rs.getString("product_Name")%></td>
								<td><%=rs.getInt("quantity")%></td>
								<td><%=rs.getDouble("tot_Amount")%></td>
								<td><%=rs.getString("status")%></td>
							</tr>

							<%
								}
							%>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>



	<div class="container" id="placedorder" style="display: none">
		<div class="row">
			<div class="col-md-12">

				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">

						<thead>
							<tr>
								<th colspan="6"><h4 align="center">Placed Orders</h4></th>
							</tr>
							<th>Order Id</th>
							<th>Purchaser Name</th>
							<th>Product Name</th>
							<th>Quantity</th>
							<th>Total Amount</th>
							
							<th>Status</th>
							<th>Total Amount</th>
						</thead>

						<tbody>

							<%
								String query2 = "select * from purchaserorder_tbl";
								ResultSet rs2 = stmt.executeQuery(query);
								while (rs2.next()) {
							%>

							<tr id="tr1" >
								<td><%=rs2.getInt("order_id")%></td>
								<td><%=rs2.getString("user_Name")%></td>
								<td><%=rs2.getString("product_Name")%></td>
								<td><%=rs2.getInt("quantity")%></td>
								<td><%=rs2.getDouble("tot_Amount")%></td>
								<td><%=rs2.getString("status")%></td>
								<td><a href="RouteAtEndUser.html"> Track Order</a></td>
							</tr>

							<%
								}
							%>

						</tbody>
					</table>

					<button id="track" onclick="cellvalues()">Track</button>
				</div>
			</div>
		</div>
	</div>




	<div class="container" id="ViewStock" style="display: none">
		<div class="row">
			<div class="col-md-12">

				<div class="table-responsive">
					<table id="mytable" class="table table-bordred table-striped">

						<thead>
							<tr>
								<th colspan="6"><h4 align="center">Stock Details</h4></th>
							</tr>
							<th>Stock Id</th>
							<th>Product Name</th>
							<th>Location</th>
							<th>Manager_Name</th>
							<th>Quantity</th>
							<th>Supplier Id</th>
						</thead>

						<tbody>

							<%
								String query1 = "select * from stock_tbl";
								ResultSet rs1 = stmt.executeQuery(query1);
								while (rs1.next()) {
							%>

							<tr>
								<td><%=rs1.getInt("stock_Id")%></td>
								<td><%=rs1.getString("product_Name")%></td>
								<td><%=rs1.getString("location")%></td>
								<td><%=rs1.getString("manager_Name")%></td>
								<td><%=rs1.getInt("quantity")%></td>
								
							</tr>

							<%
								}
							%>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


</body>

</html>