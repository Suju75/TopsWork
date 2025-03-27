<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>
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
			<div class="col-4 offset-4 mt-5">
				<div class="card paint-card">
					<div class="card-body">
						<h3 class="text-center text-primary">Reset Your Password</h3>
						<form action="resetPassword" method="post">
							<div class="form-group mt-2">
								<label for="newPassword">New Password:</label> <input
									type="password" class="form-control" id="newPassword"
									name="newPassword" required>
							</div>
							<div class="form-group mt-2">
								<label for="confirmPassword">Confirm Password:</label> <input
									type="password" class="form-control" id="confirmPassword"
									name="confirmPassword" required>
							</div>
							<div class="form-group mt-2 d-flex justify-content-center">
								<button type="submit" class="btn btn-primary">Reset
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