<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HotelSearch</title>
</head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
	<a class="navbar-brand" href="#" style="color: Orange"><b>X-workz</b></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"
				style="color: Blue">Home <span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#"
				style="color: Blue">Link</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" style="color: Blue"
				id="navbarDropdown" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Dropdown </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#"
				style="color: Blue">Disabled</a></li>
		</ul>
		  <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="hotelRegester">Register</a></button>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="SearchByName.jsp">SearchByName</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<form class="form-inline my-2 my-lg-0" action="hotel" method="get">
			<input class="form-control mr-sm-2" type="text" placeholder="Search"
				aria-label="Search" name="id"> <input type="submit"
				class="
				btn btn-primary" value="search" />
		</form>
	</div>
</nav>
<body>

	<h1 style="text-align: center; color: blue">
		<b>Welcome to search page.....</b>
	</h1>
	<h4><b>FirstName:-</b></h4><h4 style="color: red">${dto.firstName}</h4><br>
	<h4><b>LastName:- </b></h4><h4 style="color: red">${dto.lastName}</h4><br>
	<h4><b>Gender:- </b></h4><h4 style="color: red">${dto.gender}</h4><br>
	<h4><b>G-mail:- </b></h4><h4 style="color: blue">${dto.email}</h4><br>
	<h4><b>PhoneNumber:- </b></h4><h4 style="color: red">${dto.phoneNum}</h4><br>
	<h4><b>Pin-Code:- </b></h4><h4 style="color: red">${dto.pinCode}</h4><br>
	<h4><b>Address:- </b></h4><h4 style="color: red">${dto.address}</h4><br>
	<h4><b>Cover-Letter:-</b></h4><h4 style="color: red">${dto.message}</h4><br>
</body>
</html>