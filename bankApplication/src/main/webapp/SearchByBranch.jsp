<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Update list</title>
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
		src="https://png.pngtree.com/png-vector/20190405/ourmid/pngtree-vector-bank-icon-png-image_912135.jpg"
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
					<a href="SearchById.jsp">SearchById</a><br>
                      <a href="SearchByName.jsp">SearchByName</a><br>
                      <a href="UpdateBank.jsp">UpdateBank</a><br>
                       <a href= "CustomerReg.jsp">Customer Reg</a><br>
                      <a href= "FindByNameAndBranch.jsp">FindByNameAndBranch</a><br>
                       <a href= "findAll">FindAll</a><br>
				</div></li>
			<li class="nav-item"><a class="nav-link disabled" href="#"
				style="color: Red">Disabled</a></li>
		</ul>

<form class="form-inline my-2 my-lg-0" action="byBranch" method="get">
			<input class="form-control mr-sm-2" type="text" placeholder="SearchByBranch"
				aria-label="Search" name="branch"> <input type="submit"
				class="btn btn-primary" value="search" />
		</form>
</nav>
<body>

	<span style="color: red">${msg }</span>
	<span style="color: red">${delete }${id }</span>
	<span style="color: red">${notDeleted }</span>
	<br>
	<br>
	<table style="padding: 25;" class="table table-dark">
		<col>
		<tr class="set">
		<th style="color: rgb(226, 79, 22);" scope="col">ID</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Name</th>
			<th style="color: rgb(226, 79, 22);" scope="col">IFSC Code</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Branch</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Address</th>
			<th style="color: rgb(226, 79, 22);" scope="col">PhoneNum</th>
			<th style="color: rgb(226, 79, 22);" scope="col">E-mail</th>
			<th style="color: rgb(226, 79, 22);" scope="col">AadharNum</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Password</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Re-enterpass</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Update</th>
			<th style="color: rgb(226, 79, 22);" scope="col">Delete</th>
			
			
		</tr>
		
		<c:forEach items="${dtos}" var="d">
			<tr>
				<td style="color: blueviolet;">${d.id}</td>
				<td style="color: blueviolet;">${d.name}</td>
				<td style="color: blueviolet;">${d.ifscCode}</td>
				<td style="color: blueviolet;">${d.branch}</td>
				<td style="color: blueviolet;">${d.address}</td>
				<td style="color: blueviolet;">${d.phoneNum}</td>
				<td style="color: blueviolet;">${d.email}</td>
				<td style="color: blueviolet;">${d.aadharNum}</td>
				<td style="color: blueviolet;">${d.password}</td>
				<td style="color: blueviolet;">${d.reenterpas}</td>
				<td><a href="update?id=${d.id}">Update</a></td>
	            <td><a href="delete?id=${d.id }" class="btn btn-danger">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
<style>
body {
	background-color: rgba(2, 2, 2, 0.956);
	 background-image: url("https://logo-all.ru/uploads/posts/2016-03/thumbs/0_axis_bank_logo-thumb.jpg");
	
}
</style>
</html>