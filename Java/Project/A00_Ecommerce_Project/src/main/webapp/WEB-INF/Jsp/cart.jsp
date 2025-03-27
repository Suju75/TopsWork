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
<title>Amado - Furniture Ecommerce Template | Cart</title>

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

		<div class="cart-table-area section-padding-100">
			<div class="container-fluid">
				<div class="row">
					<div class="col-12 col-lg-8">
						<div class="cart-title mt-50">
							<h2>Shopping Cart</h2>
						</div>

						<div class="cart-table clearfix">
							<table class="table table-responsive">
								<thead>
									<tr>
										<th></th>
										<th>Product Name</th>
										<!-- <th>User Id</th> -->
										<th>Price</th>
										<th>Quantity</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${cart}" var="c">
										<tr>
											<td class="cart_product_img"><a href="#"><img
													src="img/${c.getProduct().getProductImage()}" alt="Product"></a></td>
											<td class="cart_product_desc">

												<h5>${c.getProduct().getProductName()}</h5>
											</td>


											<%-- 	<td>${c.getUser().getId()}</td> --%>


											<td class="price"><span>${c.getProduct().getProductPrice()}</span></td>

											<td class="qty">
												<div class="qty-btn d-flex">
													<p>Qty</p>
													<div class="quantity">
														<span class="qty-minus"
															onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i
															class="fa fa-minus" aria-hidden="true"></i></span> <input
															type="number" class="qty-text" id="qty" step="1" min="1"
															max="300" name="quantity" value="${c.getQty()}">
														<span class="qty-plus"
															onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i
															class="fa fa-plus" aria-hidden="true"></i></span>
													</div>

												</div> <a href="remove?cid=${c.getCartId()} "
												class="btn btn-danger mt-2 d-flex justify-content-center">Cancel</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

					<div class="cart-summary">
						<h5>Cart Total</h5>
						<c:set var="total" value="0" />
						<c:forEach items="${cart}" var="ct">
							<c:set var="total"
								value="${total + ct.getProduct().getProductPrice() * ct.getQty()}" />
						</c:forEach>

						<ul class="summary-table">
							<li><span>subtotal:</span> <span>${total}</span></li>
							<li><span>delivery:</span> <span>₹40</span></li>
							<li><span>total:</span> <span id="amt">${total + 40}</span></li>
						</ul>

						<div class="payment-method">
							<!-- Payment Form -->
							<form action="" method="post">
								<div class="custom-control custom-radio mr-sm-2">
									<input type="radio" class="custom-control-input" id="cod"
										name="paymentMethod" value="COD" checked
										onclick="toggleButtons()"> <label
										class="custom-control-label" for="cod">Cash on
										Delivery</label>
								</div>

								<div class="custom-control custom-radio mr-sm-2">
									<input type="radio" class="custom-control-input" id="paypal"
										name="paymentMethod" value="PayPal" onclick="toggleButtons()">
									<label class="custom-control-label" for="paypal">PayPal
										<img class="ml-15" src="img/core-img/paypal.png" alt="">
									</label>
								</div>


							</form>
						</div>

						<div class="cart-btn mt-4">
							<button id="checkoutBtn" class="btn amado-btn w-100">Checkout</button>

						</div>
					</div>
				</div>
			</div>
		</div>
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

	<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
	<script>
		document.getElementById('checkoutBtn').onclick = function(e) {

			e.preventDefault();
			var amt = $("#amt").text().trim();
			$.get("payment", {amt}, function(rs) {
				alert(rs)

				const data = JSON.parse(rs)

				var options = {
					"key" : "rzp_test_FtWVVt6YTsOyuV", // Enter the Key ID generated from the Dashboard
					"amount" : data.amount, // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
					"currency" : "INR",
					"name" : "Kiran Thakare",
					"description" : "Tops Techano",
					"image" : "https://example.com/your_logo",
					"order_id" : data.id, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
					"handler" : function(response) {
						/* alert(response.razorpay_payment_id);
						alert(response.razorpay_order_id);
						alert(response.razorpay_signature)  */
						var oid=response.razorpay_payment_id;
						$.get("addorder",{oid},function(rt){
							alert(rt)
						})
					},
					"prefill" : {
						"name" : "Gaurav Kumar",
						"email" : "gaurav.kumar@example.com",
						"contact" : "9000090000"
					},
					"notes" : {
						"address" : "Razorpay Corporate Office"
					},
					"theme" : {
						"color" : "#3399cc"
					}
				};
				var rzp1 = new Razorpay(options);
				rzp1.on('payment.failed', function(response) {
					alert(response.error.code);
					alert(response.error.description);
					alert(response.error.source);
					alert(response.error.step);
					alert(response.error.reason);
					alert(response.error.metadata.order_id);
					alert(response.error.metadata.payment_id);
				});
				rzp1.open();
			})

			
		}
	</script>
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>

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