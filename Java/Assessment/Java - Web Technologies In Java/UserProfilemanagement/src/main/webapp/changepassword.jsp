<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
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

<script type="text/javascript">
	function validateOldPassword() {

		var password = document.getElementById("oldPassword").value;
		var errorElement = document.getElementById("olderr");

		var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])(?!.\s)[A-Za-z\d@.#$!%*?&]{8,15}$/;

		if (password == "") {
			errorElement.innerHTML = "Please Enter Password";
		} else if (!regex.test(password)) {

			errorElement.innerHTML = "Must contains atleast one uppercase, lowercase, digit and length up to 16 characters";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validatePassword() {

		var password = document.getElementById("confirmPassword").value;
		var errorElement = document.getElementById("passError");

		var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])(?!.\s)[A-Za-z\d@.#$!%*?&]{8,15}$/;

		if (password == "") {
			errorElement.innerHTML = "Please Enter Password";
		} else if (!regex.test(password)) {

			errorElement.innerHTML = "Must contains atleast one uppercase, lowercase, digit and length up to 16 characters";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validateConfirmpassword() {

		var cpass = document.getElementById("confirmPassword").value;
		var password = document.getElementById("confirmPassword").value;
		var errorElement = document.getElementById("cpassError");

		if (cpass == "") {
			errorElement.innerHTML = "Please Renter Confirm Password";
		} else if (cpass != password) {

			errorElement.innerHTML = "PassWord Not Match Check Password";
		} else {

			errorElement.innerHTML = "";
		}

	}
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-4 offset-4 mt-5">
				<div class="card paint-card">
					<div class="card-body">
						<h3 class="text-center text-primary">Change Your Password</h3>
						<%
						String success = (String) request.getAttribute("success");
						if (success != null) {
						%>
						<p class="text-danger text-center"><%=success%></p>
						<%
						}
						%>
						<form action="changePassword" method="post">
							<div class="form-group mt-2">
								<label for="oldPassword">Old Password:</label> <input
									type="password" class="form-control" id="oldPassword"
									name="oldPassword" onkeyup="validateOldPassword()" required><span
									id="olderr" class="text-danger text-center"></span>
							</div>
							<div class="form-group mt-2">
								<label for="newPassword">New Password:</label> <input
									type="password" class="form-control" id="newPassword"
									onkeyup="validatePassword()" name="newPassword" required>
								<span id="passError" class="text-danger text-center"></span>
							</div>
							<div class="form-group mt-2">
								<label for="confirmPassword">Confirm New Password:</label> <input
									type="password" class="form-control" id="confirmPassword"
									name="confirmPassword" onkeyup="validateConfirmpassword()"
									required><span id="cpassError"
									class="text-danger text-center"></span>
							</div>
							<div class="form-group mt-2 d-flex justify-content-center">
								<button type="submit" class="btn btn-primary">Change
									Password</button>
							</div>

							<%
							String err = (String) request.getAttribute("err");
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