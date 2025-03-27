<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OTP Verification</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background: linear-gradient(to right, #6a11cb, #2575fc);
	color: #fff;
}

.otp-container {
	background-color: rgba(255, 255, 255, 0.9);
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
	max-width: 400px;
	width: 100%;
	text-align: center;
}

.otp-container h2 {
	margin-bottom: 20px;
}

.otp-container .form-control {
	border: none;
	border-radius: 5px;
	padding: 15px;
	font-size: 18px;
}

.otp-container button {
	font-size: 18px;
	padding: 10px 20px;
	border-radius: 5px;
}
</style>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function resend() {
		$.post("resend", {}, function(rt) {
			alert(rt)
		})
	}
</script>

</head>
<body>


	<div class="otp-container">
		<h2 class="text-warning">OTP Verification</h2>

		<%
		String message = (String) session.getAttribute("message");
		if (message != null) {
		%>
		<p class="text-danger">${err }</p>
		<%
		}
		%>

		<form id="otpForm" action="otp" method="post">
			<div class="form-group">
				<label for="otp" class="sr-only">Enter OTP</label> <input
					type="text" id="otp" name="otp" class="form-control"
					placeholder="Enter 4-digit OTP" pattern="\d{4}" maxlength="4">
				<small class="form-text text-muted">Please enter a 4-digit
					number.</small> <span style="color: red;" id="error"></span>
			</div>
			<button type="submit" class="btn btn-success btn-block">Verify</button>
			<button class="btn btn-warning btn-block" onclick="resend()">Resend
				OTP</button>

			<%
			String err = (String) session.getAttribute("err");
			if (err != null) {
			%>
			<p class="text-danger">${err }</p>
			<%
			}
			%>
		</form>
	</div>



</body>
</html>