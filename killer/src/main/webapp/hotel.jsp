
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="100px" height="100px"></a>
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
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">
						<b>Dropdown</b> </a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#">Action</a></li>
						<li><a class="dropdown-item" href="#">Another action</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Something else here</a></li>
					</ul></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			
		</div>
	</div>
</nav>
<body>
	
	<div class="formbold-main-wrapper">
		<div class="formbold-form-wrapper">
			<img
				src="https://x-workz.in/static/media/coding_img.bef297f81da57125500a.png"
				width="400px" height="400px">
			<form action="hotel" method="post">

				<div class="formbold-input-flex">
					

					<div>
						<label for="hotelName" class="formbold-form-label"><b>HotelName</b>
						</label> <input type="text" name="hotelName" id="hotelName"
							placeholder="HotelName" class="formbold-form-input" />
					</div>
				</div>

				<div class="formbold-input-flex">
					<div>
						<label for="dishName" class="formbold-form-label">
							<b>DishName</b> </label> 
							<input type="text" name="dishName" placeholder="DishName" class="formbold-form-input" />
					</div>

					<div>
						<label class="formbold-form-label"><b>Quantity</b></label> 
						<select class="formbold-form-input" name="quantity" id="Quantity">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="2">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
						</select>
					</div>
				</div>
				<div class="formbold-mb-3 formbold-input-wrapp">
					<label for="phone" class="formbold-form-label"> <b>Price</b> </label>

					<div>
						<input type="text" name="price" id="price" placeholder="price" class="formbold-form-input formbold-w-45" />
					</div>
				</div>
				<div class="formbold-mb-3 formbold-input-wrapp">
					<label for="away" class="formbold-form-label"> <b>TakeAway:-</b></label>
					<label for="away" class="formbold-form-label"> Yes </label>
					<input value="true" type="radio" name="takeAway" /> 
					<label for="away" class="formbold-form-label"> NO </label>
					<input value="false" type="radio" name="takeAway" />
				</div>
				<div class="formbold-mb-3 formbold-input-wrapp">
					<label for="away" class="formbold-form-label"> <b>Egg Type:-</b>
					</label> <select class="formbold-form-input" name="type"id="type">
						<option value="Standard White Eggs">Standard White Eggs</option>
						<option value="Standard Brown Eggs">Standard Brown Eggs</option>
						<option value="Furnished / Enriched / Nest-LaidEggs">Furnished / Enriched / Nest-LaidEggs</option>
						<option value="Free-Run Eggs">Free-Run Eggs</option>
						<option value="Free-Range Eggs">Free-Range Eggs</option>
						<option value="Organic Eggs">Organic Eggs</option>
						<option value="Omega Eggs">Omega Eggs</option>
						<option value="Vitamin-Enhanced Eggs">Vitamin-Enhanced Eggs</option>
						<option value="Processed Eggs">Processed Eggs</option>

					</select>

				</div>
				<input class="formbold-btn" type="submit" value="applay"  />
			</form>
		</div>
	</div>
	<style>
@import
url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Inter', sans-serif;
}

.formbold-mb-3 {
	margin-bottom: 15px;
}

.formbold-main-wrapper {
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 48px;
}

.formbold-form-wrapper {
	margin: 0 auto;
	max-width: 570px;
	width: 100%;
	background: white;
	padding: 40px;
}

.formbold-img {
	display: block;
	margin: 0 auto 45px;
}

.formbold-input-wrapp>div {
	display: flex;
	gap: 20px;
}

.formbold-input-flex {
	display: flex;
	gap: 20px;
	margin-bottom: 15px;
}

.formbold-input-flex>div {
	width: 50%;
}

.formbold-form-input {
	width: 100%;
	padding: 13px 22px;
	border-radius: 5px;
	border: 1px solid #dde3ec;
	background: #ffffff;
	font-weight: 500;
	font-size: 16px;
	color: #536387;
	outline: none;
	resize: none;
}

.formbold-form-input::placeholder, select.formbold-form-input,
	.formbold-form-input[type='date']::-webkit-datetime-edit-text,
	.formbold-form-input[type='date']::-webkit-datetime-edit-month-field,
	.formbold-form-input[type='date']::-webkit-datetime-edit-day-field,
	.formbold-form-input[type='date']::-webkit-datetime-edit-year-field {
	color: rgba(83, 99, 135, 0.5);
}
.formbold-form-input:focus {
	border-color: #6a64f1;
	box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
}

.formbold-form-label {
	color: #07074D;
	font-weight: 500;
	font-size: 14px;
	line-height: 24px;
	display: block;
	margin-bottom: 10px;
}
.formbold-form-file-flex {
	display: flex;
	align-items: center;
	gap: 20px;
}
.formbold-form-file-flex .formbold-form-label {
	margin-bottom: 0;
}
.formbold-form-file {
	font-size: 14px;
	line-height: 24px;
	color: #536387;
}
.formbold-form-file::-webkit-file-upload-button {
	display: none;
}
.formbold-form-file:before {
	content: 'Upload file';
	display: inline-block;
	background: #EEEEEE;
	border: 0.5px solid #FBFBFB;
	box-shadow: inset 0px 0px 2px rgba(0, 0, 0, 0.25);
	border-radius: 3px;
	padding: 3px 12px;
	outline: none;
	white-space: nowrap;
	-webkit-user-select: none;
	cursor: pointer;
	color: #637381;
	font-weight: 500;
	font-size: 12px;
	line-height: 16px;
	margin-right: 10px;
}
.formbold-btn {
	text-align: center;
	width: 100%;
	font-size: 16px;
	border-radius: 5px;
	padding: 14px 25px;
	border: none;
	font-weight: 500;
	background-color: #6a64f1;
	color: white;
	cursor: pointer;
	margin-top: 25px;
}
.formbold-btn:hover {
	box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
}
.formbold-w-45 {
	width: 45%;
}
</style>
</body>

</html>