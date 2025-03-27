<nav class="navbar navbar-expand-lg navbar-light bg-primary">
	<div class="container-fluid">
		<a class="navbar-brand" href="index.jsp"><i
			class="fa-solid fa-house"></i></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="signup.jsp">Signup</a></li>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item dropdown">
					<form class="d-flex">
						<button class="btn btn-light dropdown-toggle" type="button"
							id="dropdownMenu" data-bs-toggle="dropdown"
							aria-expanded="false">
							<i class="fa-solid fa-user"></i> ${name} ${lname }
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu">
							<li><a class="dropdown-item" href="changepassword.jsp">Change
									Password</a></li>
							<li><a class="dropdown-item" href="logout">Logout</a></li>
						</ul>
					</form>
				</li>
			</ul>
		</div>
	</div>
</nav>

