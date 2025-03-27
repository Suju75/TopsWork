<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Title  -->
<title>Amado - Furniture Ecommerce Template | Product Details</title>

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
				<a href="/"><img src="img/core-img/logo.png" alt=""></a>
			</div>
			<!-- Navbar Toggler -->
			<div class="amado-navbar-toggler">
				<span></span><span></span><span></span>
			</div>
		</div>

		<!-- Header Area Start -->
		<header class="header-area clearfix">

			<jsp:include page="header.jsp"></jsp:include>
		</header>
		<!-- Header Area End -->

		<!-- Product Details Area Start -->
		<div class="single-product-area section-padding-100 clearfix">
			<div class="container-fluid">

				<div class="row">
					<div class="col-12">
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb mt-50">
								<li class="breadcrumb-item"><a href="/">Home</a></li>
								<li class="breadcrumb-item"><a href="shop">Shop</a></li>
								<li class="breadcrumb-item"><a href="productDetails">ProductDetails</a></li>
								<!-- <li class="breadcrumb-item active" aria-current="page">white
									modern chair</li> -->
							</ol>
						</nav>
					</div>
				</div>
				<c:forEach items="${productbyid}" var="p">
					<div class="row">
						<div class="col-12 col-lg-7">
							<div class="single_product_thumb">
								<div id="product_details_slider" class="carousel slide"
									data-ride="carousel">
									<!-- <ol class="carousel-indicators">
									<li class="active" data-target="#product_details_slider"
										data-slide-to="0"
										style="background-image: url(img/product-img/pro-big-1.jpg);">
									</li>
									<li data-target="#product_details_slider" data-slide-to="1"
										style="background-image: url(img/product-img/pro-big-2.jpg);">
									</li>
									<li data-target="#product_details_slider" data-slide-to="2"
										style="background-image: url(img/product-img/pro-big-3.jpg);">
									</li>
									<li data-target="#product_details_slider" data-slide-to="3"
										style="background-image: url(img/product-img/pro-big-4.jpg);">
									</li>
								</ol> -->
									<div class="carousel-inner">
										<div class="carousel-item active">
											<a class="gallery_img" href="img/product-img/pro-big-1.jpg">
												<img class="d-block w-100" src="img/${p.getProductImage()}"
												alt="First slide">
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-12 col-lg-5">
							<div class="single_product_desc">
								<!-- Product Meta Data -->
								<div class="product-meta-data">
									<div class="line"></div>
									<p class="product-price">${p.getProductPrice()}</p>
									<a href="product-details.html">
										<h6>${p.getProductName()}</h6>
									</a>
									<!-- Ratings & Review -->
									<div
										class="ratings-review mb-15 d-flex align-items-center justify-content-between">
										<div class="ratings">
											<i class="fa fa-star" aria-hidden="true"></i> <i
												class="fa fa-star" aria-hidden="true"></i> <i
												class="fa fa-star" aria-hidden="true"></i> <i
												class="fa fa-star" aria-hidden="true"></i> <i
												class="fa fa-star" aria-hidden="true"></i>
										</div>
										<div class="review">
											<a href="#">Write A Review</a>
										</div>
									</div>
									<!-- Avaiable -->
									<p class="avaibility">
										<i class="fa fa-circle"></i> In Stock
									</p>
								</div>

								<div class="short_overview my-5">
									<p>${p.getProductDescription()}</p>
								</div>

								<!-- Add to Cart Form -->
								<form class="cart clearfix" action="addcart" method="post">
									<div class="cart-btn d-flex mb-50">
										<input type="hidden" name="pid" value="${p.getPid()}">
										<p>Qty</p>
										<div class="quantity">
											<span class="qty-minus"
												onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i
												class="fa fa-caret-down" aria-hidden="true"></i></span> <input
												type="number" class="qty-text" id="qty" step="1" min="1"
												max="300" name="quantity" value="1"> <span
												class="qty-plus"
												onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i
												class="fa fa-caret-up" aria-hidden="true"></i></span>
										</div>
									</div>
									<button type="submit" name="addtocart" value=""
										class="btn amado-btn">Add to cart</button>


								</form>

							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<!-- Product Details Area End -->
	</div>
	<!-- ##### Main Content Wrapper End ##### -->

	<!-- ##### Newsletter Area Start ##### -->
	<section class="newsletter-area section-padding-100-0">
		<div class="container">
			<div class="row align-items-center">
				<!-- Newsletter Text -->
				<div class="col-12 col-lg-6 col-xl-7">
					<div class="newsletter-text mb-100">
						<h2>
							Subscribe for a <span>25% Discount</span>
						</h2>
						<p>Nulla ac convallis lorem, eget euismod nisl. Donec in
							libero sit amet mi vulputate consectetur. Donec auctor interdum
							purus, ac finibus massa bibendum nec.</p>
					</div>
				</div>
				<!-- Newsletter Form -->
				<div class="col-12 col-lg-6 col-xl-5">
					<div class="newsletter-form mb-100">
						<form action="#" method="post">
							<input type="email" name="email" class="nl-email"
								placeholder="Your E-mail"> <input type="submit"
								value="Subscribe">
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ##### Newsletter Area End ##### -->

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