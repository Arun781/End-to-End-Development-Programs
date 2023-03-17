<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Webpage Design</title>
</head>
<body>
   
	<form action="bankApp" method="post">
		<div class="main">
			<div class="navbar">
				<div class="icon">
					<h2 class="logo">Apna_Bank</h2>
				</div>

                <div class="dropdown">
                    <button class="dropbtn">Dropdown</button>
                    <div class="dropdown-content">
                      <a href="SearchById.jsp">SearchById</a>
                      <a href="SearchByName.jsp">SearchByName</a>
                      <a href="UpdateBank.jsp">UpdateBank</a>
                      <a href="SearchByBranch.jsp">SearchByBranch</a>
                      <a href= "FindByNameAndBranch.jsp">FindByNameAndBranch</a>
                       <a href= "findAll">FindAll</a>
                      
 
                    </div>
                </div>
              </div>

				<div class="search">
					<!-- <input class="srch" type="search" name=""
						placeholder="Type To text"> <a href="#">
						<button class="btn">Search</button>
					</a> -->
				</div>
			</div>
			<div class="content">
				<h1>
					<b>Apna Account</b> <br> <b></b><span>Registration</span> <br>Form</b>
				</h1>
				<br> <br> <br>
				<button class="cn">
					<a href="index.jsp">Home_Page</a>
				</button>
            </div>
				<div class="form">
					<h2>Basic Details</h2>
					
					
          <div>
          	<span style="color: green">${success }</span><br>
          	<span style="color: red">${pass }</span>
            <c:forEach items="${error }" var="e">
            <span style="color: red">${e.message }</span><br>
            </c:forEach>
            </div>
					<input type="text" name="name" placeholder="Enter Full Name" value="${dto.name }">
				    <input type="text" name="phoneNum" placeholder="Phone Number" value="${dto.phoneNum }">
                    <input type="text" name="email" placeholder="E-Mail" value="${dto.email }">
					<input type="text" name="aadharNum" placeholder="Aadhar Number" value="${dto.aadharNum }">
                    <input type="text" name="ifscCode" placeholder="IFSC code" value="${dto.ifscCode }">
					<input type="text" name="branch" placeholder="Branch Name" value="${dto.branch }">
					<input type="text" name="address" placeholder="Address" value="${dto.address }">
					<input type="text" name="password" placeholder="Enter Password" >
                    <input type="text" name="reenterpas" placeholder="Re Enter Password" >
					<button class="btnn" href="index.jsp">Sign-Up</button>
					<!-- <p class="link">
						Go to<br> <a href="index.jsp">Log-in </a>
						here</a>
					</p> -->

				</div>
			</div>
		</div>
		</div>
		</div>
	</form>
  
</body>
<style>

* {
	margin: 0;
	padding: 0;
}

body {
	width: 100%;
    background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNduHZEKPAuJCJ-PGcgI6KV4AP7csqiZkQ7aik52es&s");
    background-position: center;
	background-size: cover;
	height: 100vh;
}

.navbar {
    display: flexbox;
	
}

.icon {
	width: 200px;
	float: left;
	height: 70px;
}

.logo {
    display: flexbox;
    background-color: #ff7200;
    width: 1500px;
	margin: auto;
    margin-top: 0px;
    margin-right: -25px;
    padding: 35px;
    background-size: 100%;
	color: #0f0f0f;
	
	
}

.menu {
	width: 400px;
	float: left;
	height: 70px;
}

ul {
	float: left;
	display: flex;
	justify-content: center;
	align-items: center;
}

ul li {
	list-style: none;
	margin-left: 60px;
	margin-top: 27px;
	font-size: 14px;
}

ul li a {
	text-decoration: none;
	color: #fff;
	font-family: Arial;
	font-weight: bold;
	transition: 0.4s ease-in-out;
}

ul li a:hover {
	color: #ff7200;
}

.search {
	width: 300px;
	float: left;
	margin-left: 280px;
}

.srch {
	font-family: 'Times New Roman';
	width: 200px;
	height: 40px;
	background: transparent;
	border: 1px solid #ff7200;
	margin-top: 13px;
	color: #fff;
	border-right: none;
	font-size: 16px;
	float: left;
	padding: 10px;
	border-bottom-left-radius: 5px;
	border-top-left-radius: 5px;
}

.btn {
	width: 100px;
	height: 40px;
	background: #ff7200;
	border: 2px solid #ff7200;
	margin-top: 13px;
	color: #fff;
	font-size: 15px;
	border-bottom-right-radius: 5px;
	border-bottom-right-radius: 5px;
	transition: 0.2s ease;
	cursor: pointer;
}

.btn:hover {
	color: #000;
}

.btn:focus {
	outline: none;
}

.srch:focus {
	outline: none;
}

.content {
	width: 1200px;
	height: auto;
	margin: auto;
	color: #fff;
	position: relative;
    margin-left: 900px;
}

.content .par {
	padding-left: 20px;
	padding-bottom: 25px;
	font-family: Arial;
	letter-spacing: 1.2px;
	line-height: 30px;
   
}

.content h1 {
	font-family: 'Times New Roman';
	font-size: 50px;
	padding-left: 20px;
	margin-top: 9%;
	letter-spacing: 2px;
}

.content .cn {
	width: 160px;
	height: 40px;
	background: #ff7200;
	border: none;
	margin-bottom: 10px;
	margin-left: 20px;
	font-size: 18px;
	border-radius: 10px;
	cursor: pointer;
	transition: .4s ease;
}

.content .cn a {
	text-decoration: none;
	color: #000;
	transition: .3s ease;
}

.cn:hover {
	background-color: #fff;
}

.content span {
	color: #ff7200;
	font-size: 60px
}

.form {
	width: 250px;
	
	
	position: absolute;
	top: 150px;
	right : 980px;
	transform: translate(0%, -5%);
	border-radius: 10px;
	padding: 25px;
	height: auto;
}

.form h2 {
	width: 220px;
	font-family: sans-serif;
	text-align: center;
	color: white;
	font-size: 22px;
	background-color: #ff7200;
	border-radius: 10px;
	margin: 2px;
	padding: 8px;
}

.form input {
	width: 240px;
	height: 35px;
	background: transparent;
	border-bottom: 1px solid #ff7200;
	border-top: none;
	border-right: none;
	border-left: none;
	color: #fff;
	font-size: 15px;
	letter-spacing: 1px;
	margin-top: 10px;
	font-family: sans-serif;
}

.form input:focus {
	outline: none;
}

::placeholder {
	color: #fff;
	font-family: Arial;
}

.btnn {
	width: 240px;
	height: 40px;
	background: #ff7200;
	border: none;
	margin-top: 30px;
	font-size: 18px;
	border-radius: 10px;
	cursor: pointer;
	color: #fff;
	transition: 0.4s ease;
}

.btnn:hover {
	background: #fff;
	color: #ff7200;
}

.btnn a {
	text-decoration: none;
	color: #ff7200;
	font-weight: bold;
}

.form .link {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 17px;
	padding-top: 20px;
    margin-left: 25%;
    color: #ffffff;
}

.form .link a {
	text-decoration: none;
	color: #ff7200;
}

.liw {
	padding-top: 15px;
	padding-bottom: 10px;
	text-align: center;
}

.icons a {
	text-decoration: none;
	color: #fff;
}

.icons ion-icon {
	color: #fff;
	font-size: 30px;
	padding-left: 14px;
	padding-top: 5px;
	transition: 0.3s ease;
}

.icons ion-icon:hover {
	color: #ff7200;
}

  /* Dropdown Button */
.dropbtn {
 margin-top: 5.5px;
 background-color: #040404;
 margin-left: 950px;
 color: white;
 padding: 25px;
 font-size: 25px;
 border: none;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
 position: relative;
 display: inline-block;

}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
 display: none;
 position: absolute;
 background-color: #f1f1f1;
 min-width: 160px;
 margin-left: 950px;
 margin-top: -100x;
 box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
 z-index: 1;
 opacity: .8px;
}

/* Links inside the dropdown */
.dropdown-content a {
 color: black;
 padding: 15px;
 text-decoration: none;
 display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #ff7200;}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {display: block;}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {background-color: #ff7200 ;}
</style>
</html>