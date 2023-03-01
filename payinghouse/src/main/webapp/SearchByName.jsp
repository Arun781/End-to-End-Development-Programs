<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Registration Form</title>
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
	<a class="navbar-brand" href="#"><img
		src="https://qph.cf2.quoracdn.net/main-qimg-5e2b6b4e3e08ff7942a9188d359d2dba.webp"
		alt="" height="90px" width="150px"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"
				style="color: Red">Home <span class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="#"
				style="color: Red">Link</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				style="color: Red" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Dropdown </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#"
				style="color: Red">Disabled</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				<a href="hotelRegester">Register</a>
			</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				<a href="HotelSearch.jsp">SearchById</a>
			</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

		</form>
		<form class="form-inline my-2 my-lg-0" action="firstName" method="get">
			<input class="form-control mr-sm-2" type="text"
				placeholder="SearchByName" aria-label="Search" name="firstName">
			<input type="submit" class="
				btn btn-primary" value="search" />

		</form>
	</div>
</nav>
<body>

	


	<br>
	<br>
	<table style="padding: 25;" class="table table-dark">
		<col>
		<tr class="set">
			<th style="color: rgb(226, 79, 22);" scope="col">First Name</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Last Name</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Phone Number</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Gender</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Pin-code</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Email</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Address</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Cover Letter</th>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td style="color: blueviolet;">${l.firstName}</td>
				<td style="color: blueviolet;">${l.lastName}</td>
				<td style="color: blueviolet;">${l.email}</td>
				<td style="color: blueviolet;">${l.gender}</td>
				<td style="color: blueviolet;">${l.pinCode}</td>
				<td style="color: blueviolet;">${l.phoneNum}</td>
				<td style="color: blueviolet;">${l.address}</td>
				<td style="color: blueviolet;">${l.message}</td>
			</tr>
		</c:forEach>
	</table>
</body>
<style>
body {
	background-color: rgba(2, 2, 2, 0.956);
}
</style>
</html>