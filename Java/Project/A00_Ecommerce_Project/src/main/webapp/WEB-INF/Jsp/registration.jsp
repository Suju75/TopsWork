<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 4 meta tags must come first in the head; any other head content must come after these tags -->

<!-- Title  -->
<title>Amado - Furniture Ecommerce Template | Checkout</title>

<!-- Favicon  -->
<link rel="icon" href="img/core-img/favicon.ico">

<!-- Core Style CSS -->
<link rel="stylesheet" href="css/core-style.css">
<link rel="stylesheet" href="style.css">

</head>

<body>
	<!-- Search Wrapper Area Start -->
	<div class="search-wrapper section-padding-100">
		<div class="search-close">
			<i class="fa fa-close" aria-hidden="true"></i>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="search-content">
						<form action="#" method="get">
							<input type="search" name="search" id="search"
								placeholder="Type your keyword...">
							<button type="submit">
								<img src="img/core-img/search.png" alt="">
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Search Wrapper Area End -->

	<!-- ##### Main Content Wrapper Start ##### -->
	<div class="main-content-wrapper d-flex clearfix">

		<!-- Mobile Nav (max width 767px)-->
		<div class="mobile-nav">
			<!-- Navbar Brand -->
			<div class="amado-navbar-brand">
				<a href="index.html"><img src="img/core-img/logo.png" alt=""></a>
			</div>
			<!-- Navbar Toggler -->
			<div class="amado-navbar-toggler">
				<span></span><span></span><span></span>
			</div>
		</div>



		<div class="container">
			<div class="row">
				<div class="col-12 ">
					<div class="checkout_details_area mt-50 clearfix">

						<div class="cart-title text-center">
							<h2>Registration Form</h2>
						</div>

						<form action="addUser" method="post">
							<div class="row">
								<input type="hidden" value="${user.id}" name="id">
								<div class="col-md-6 mb-3">
									<input type="text" class="form-control" id="uname" name="name"
										value="${user.name }" placeholder="Username" required>
								</div>
								<div class="col-md-6 mb-3">
									<input type="text" class="form-control" id="email" name="email"
										value="${user.email }" placeholder="Email" required>
								</div>
								<div class="col-12 mb-3">
									<input type="tel" class="form-control" id="phone" name="phone"
										placeholder="Phone Number" value="${user.phone}">
								</div>

								<div class="col-12 mb-3">
									<input type="text" class="form-control" id="phone"
										name="address" placeholder="Enter Addresss"
										value="${user.address}">
								</div>

								<div class="col-12 mb-3">
									<input type="text" class="form-control" id="phone"
										name="pincode" placeholder="Enter Pincode"
										value="${user.pincode}">
								</div>

								<div class="col-12 mb-3">
									<input type="password" class="form-control" id="password"
										placeholder="Password" value="${user.password}"
										name="password">
								</div>
								<div class="col-12 mb-3">
									<input type="password" class="form-control" id="cpassword"
										placeholder="Confirm Password" value="">
								</div>
								<div class="col-12 mb-3">
									<input type="submit" class="btn btn-primary"> <a
										href="login">User Already Exits? Login Here!</a>
								</div>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>


	<!-- ##### Footer Area Start ##### -->
	<footer class="footer_area clearfix">
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
	<!-- ##### Footer Area End ##### -->

	<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
	<script src="js/jquery/jquery-2.2.4.min.js"></script>
	<!-- Popper js -->
	<script src="js/popper.min.js"></script>
	<!-- Bootstrap js -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Plugins js -->
	<script src="js/plugins.js"></script>
	<!-- Active js -->
	<script src="js/active.js"></script>

</body>

</html>