<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apna-Bank</title>
</head>
<body>
<form action="login" method="post">
  <div class="nav">
    <div class="apna">
      <H1>Apna_Bank</H1>
    </div>
 
  </div>
  
	<div class="container">
		<h2>Apna_Bank<span>
		</span></h2>
		<div class="text">
			<h1>Sign in</h1>
			<p>Stay updated on your professional world</p>
		</div>
		<div class="your-input">
			<div class="input">
				<input type="text" name="email" id="email" required />
				<label for="email">Email</label>
			</div>
			<div class="input">
				<input type="password" name="password" id="password" required />
				<label for="password">Password</label>
      </div>
		</div>
		<a href="#" class="forgot-password-link">Forgot_Password?</a>
		<button>Sign in</button>
		<p class="join-link">
		<a href="https://www.apnabank.co.in/" class="link">	New to Apna?</a>
		<a href="CustomerReg.jsp" class="join-now">Register now</a>
		</p>
	</div>
	</form>
</body>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');

body{
    background-color: black;
    background-image: url("https://logo-all.ru/uploads/posts/2016-03/thumbs/0_axis_bank_logo-thumb.jpg");
}
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Roboto', sans-serif;
    color: #000;
}
.apna{
    margin-top: 25px;
    text-align: left;
    color: #000000;
}
.nav{
    width: 100%;
	height: 100px;
	top: 0%;
	background: #e949aee1;
	/* box-shadow: 0 10px 15px rgba(179, 179, 179, 0.7); */
	position: absolute;
	background-blend-mode: lighten;
}
.container {
	width: 320px;
	height: 480px;
	background:  #ff4ebedd;
	/* box-shadow: 0 10px 15px rgba(179, 179, 179, 0.7); */
	position: absolute;
	top: 60%;
	left: 80%;
	right: 50%;
	transform: translate(-50%, -50%);
	border-radius: 25px;
    color: #000;
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	padding: 1rem;
}

.container h2{
	color: #000000;
	font-size: 1.6rem;
}
.text p{
	font-size: .8rem;
	padding-top: 0.3rem;
}

.input {
	position: relative;
	width: 100%;
	height: 50px;
	margin-bottom: 0.7em;
}

.your-input input{
	width: 100%;
	height: 50px;
	padding-top: 1.1rem;
	padding-left: 9px;
	outline: none;
	border: 1px solid #8c8c8c;
	border-radius: 3px;
	transition: .2s;
}

.your-input label {
	position: absolute;
	top: 30%;
	left: 10px;
	font-size: 1.1rem;
	color: #8c8c8c;
	transition: .2s;
}

.input input:focus ~ label,
.input input:valid ~ label{
	top: 10%;
	font-size: .8rem;
	color: #000;
}

.input input:focus {
	border-width: 2px;
	border-color: #000000;
}

.forgot-password-link {
	width: 155px;
	padding: .2rem;
	font-weight: bolder;
	color: #000000;
	transition: .5s;
	border-radius: 12px;
}

.forgot-password-link:hover{
	background:rgba(10, 102, 195, 0.3);
}

button {
	height: 50px;
	background: #f7f9fa;
	outline: none;
	border: none;
	border-radius: 30px;
	color: #080808;
	font-size: 1rem;
	font-weight: bolder;
}

.link {
    text-decoration: none;
	font-weight: bolder;
	color: #000;
	border-radius: 12px;
	font-weight: bolder;
	padding: .2rem;
}
.link:hover{
	background: rgba(10, 102, 195, 0.3);
}

.join-now{
	text-decoration: none;
	font-weight: bolder;
	color: #000;
	border-radius: 12px;
	font-weight: bolder;
	padding: .2rem;
}

.join-now:hover{
	background: rgba(10, 102, 195, 0.3);
}
</style>
</html>