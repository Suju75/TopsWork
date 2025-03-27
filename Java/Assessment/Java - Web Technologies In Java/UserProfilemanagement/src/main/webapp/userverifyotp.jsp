<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verify OTP</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-4 offset-4 mt-5 ">
				<div class="card paint-card">
					<div class="card-body">
						<h3 class="text-center text-primary">OTP Verification</h3>
						<form action="verifyotp" method="post">
							<div class="form-group mt-2">
								<label for="otp">Enter OTP:</label> <input type="text"
									class="form-control" id="otp" name="otp" required>
							</div>
							<div class="form-group mt-2 d-flex justify-content-center">
								<button type="submit" class="btn btn-primary">Verify
									OTP</button>
							</div>
							<%
							String err = (String) session.getAttribute("not");
							if (err != null) {
							%>
							<p class="text-danger"><%=err%></p>

							<%
							}
							%>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>