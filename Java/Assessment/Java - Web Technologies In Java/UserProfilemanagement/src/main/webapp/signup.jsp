<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
	integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />


<script type="text/javascript">
	function validateFirstName() {
		var name = document.getElementById("fname").value;
		var errorElement = document.getElementById("fnameError");

		var regex = /^[A-Za-z]+$/;

		if (name == "") {

			errorElement.innerHTML = "Please Enter First Name";
		} else if (!regex.test(name)) {

			errorElement.innerHTML = "Only alphabets are allowed";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validatelastName() {
		var name = document.getElementById("lname").value;
		var errorElement = document.getElementById("lnameError");

		var regex = /^[A-Za-z]+$/;

		if (name == "") {

			errorElement.innerHTML = "Please Enter Last Name";
		} else if (!regex.test(name)) {

			errorElement.innerHTML = "Only alphabets are allowed";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validateEmail() {
		var email = document.getElementById("email").value;

		var regex = /^[A-Za-z0-9._-]+@[A-Za-z.-]+\.[A-Za-z]{2,4}$/;

		var errorElement = document.getElementById("emailError");

		if (email == "") {

			// Please enter first name
			errorElement.innerHTML = "Please Enter Email Address";
		} else if (!regex.test(email)) {

			// Only alphabets are allowed
			errorElement.innerHTML = "Invalid Email address";
		} else {
			// remove error

			errorElement.innerHTML = "";
		}

	}

	function validateContact() {
		var contact = document.getElementById("mob").value;

		var regex = /^[0-9]{10}$/;

		var errorElement = document.getElementById("mobError");

		if (contact == "") {

			errorElement.innerHTML = "Please Enter Number";
		} else if (!regex.test(contact)) {

			errorElement.innerHTML = "Invalid contact number";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validatePassword() {

		var password = document.getElementById("pass").value;
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

		var cpass = document.getElementById("cpass").value;
		var password = document.getElementById("pass").value;
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
	<%@include file="navbar.jsp"%>
	<div class="container">
		<div class="row">

			<div class="col-5 card p-2 mt-2 offset-4">
				<h1 class="text-center text-primary">Registration</h1>
				<h4 class="text-center text-warning">${emailerr }</h4>

				<form action="add" method="post">
					<div class="form-group mt-2">
						<label for="fname">First name</label> <input type="text"
							class="form-control" id="fname" name="fname"
							onkeyup="validateFirstName()"><span id="fnameError"
							class="text-warning"></span>
					</div>

					<div class="form-group  mt-2">
						<label for="lname">LastName</label> <input type="text"
							class="form-control" id="lname" name="lname"
							onkeyup="validatelastName()"><span id="lnameError"
							class="text-warning"></span>
					</div>

					<div class="form-group  mt-2">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email"
							onkeyup="validateEmail()"><span id="emailError"
							class="text-warning"></span>
					</div>

					<div class="form-group  mt-2">
						<label for="mob">Mobile</label> <input type="text"
							class="form-control" id="mob" name="mob"
							onkeyup="validateContact()"><span id="mobError"
							class="text-warning"></span>
					</div>

					<div class="form-group  mt-2">
						<label for="address">Address</label>
						<textarea class="form-control" id="address" name="address"
							rows="3"></textarea>
					</div>

					<div class="form-group mt-2 ">
						<label for="gender">Gender :</label> <input type="radio"
							value="male" name="gender" id="gender">Male <input
							type="radio" value="female" name="gender" id="gender">Female
					</div>

					<div class="form-group ">
						<label for="pass">Password</label> <input type="password"
							class="form-control" id="pass" name="pass"
							onkeyup="validatePassword()"><span id="passError"
							class="text-warning"></span>
					</div>

					<div class="form-group ">
						<label for="cpass">Confirm Password</label> <input type="password"
							class="form-control" id="cpass" name="cpass"
							onkeyup="validateConfirmpassword()"><span id="cpassError"
							class="text-warning"></span>
					</div>

					<div class="d-flex justify-content-center mt-2">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>


			</div>

		</div>
	</div>
</body>
</html>