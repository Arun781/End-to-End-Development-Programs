<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="author" content="Yinka Enoch Adedokun">
	<meta name="description" content="Simple Forgot Password Page Using HTML and CSS">
	<meta name="keywords" content="forgot password page, basic html and css">
	<title>Forgot Password Page - HTML + CSS</title>
</head>
<body>
<form action="reset" method="post">
<c:forEach var="s" items="${success }">
<span style="color: green">${s}</span>
</c:forEach>

	<div class="row">
		<h1>Reset Password</h1>
		<h6 class="information-text"></h6>
		<div class="form-group">
			<input type="password" name="password" id="Enter New Password" required>
			<p><label for="Enter New Password">Enter New Password</label></p>
            <input type="password" name="reenterpas" id="Re-EnterPassword" required>
			<p><label for="EnterPassword">Re-Enter New Password</label></p>
			<button onclick="showSpinner()">Reset Password</button>
		</div>
	</div>
	</form>
</body>
<style>
    * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "segoe ui", verdana, helvetica, arial, sans-serif;
  font-size: 16px;
  transition: all 500ms ease; }

body {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-rendering: optimizeLegibility;
  -moz-font-feature-settings: "liga" on;
  background-color: #e949aee1; 
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNduHZEKPAuJCJ-PGcgI6KV4AP7csqiZkQ7aik52es&s");
   

}

.row {
  background-color: #e949aee1;
  color: #000;
  text-align: center;
  padding: 2em 2em 0.5em;
  width: 90%;
  margin: 8em	auto;
  border-radius: 5px; }
  .row h1 {
    font-size: 2.5em; }
  .row .form-group {
    margin: 0.5em 0; }
    .row .form-group label {
      display: block;
      color: #000;
      text-align: left;
      font-weight: 600; }
    .row .form-group input, .row .form-group button {
      display: block;
      padding: 0.5em 0;
      width: 100%;
      margin-top: 3em;
      margin-bottom: 0.5em;
      background-color: inherit;
      border: none;
      border-bottom: 1px solid #555;
      color: #000; }
      .row .form-group input:focus, .row .form-group button:focus {
        background-color: #ddd;
        color: #000;
        border: none;
        padding: 1em 0.5em; animation: pulse 1s infinite ease;}
    .row .form-group button {
      border: 1px solid ;
      border-radius: 5px;
      outline: none;
      -moz-user-select: none;
      user-select: none;
      color: #ddd;
      font-weight: 800;
      cursor: pointer;
      margin-top: 2em;
      padding: 1em; }
      .row .form-group button:hover, .row .form-group button:focus {
        background-color: #000; }
      .row .form-group button.is-loading::after {
        animation: spinner 500ms infinite linear;
        content: "";
        position: absolute;
        margin-left: 2em;
        border: 2px solid #000;
        border-radius: 100%;
        border-right-color: transparent;
        border-left-color: transparent;
        height: 1em;
        width: 4%; }
  .row .footer h5 {
    margin-top: 1em; }
  .row .footer p {
    margin-top: 2em; }
    .row .footer p .symbols {
      color: #000; }
  .row .footer a {
    color: inherit;
    text-decoration: none; }

.information-text {
  color: #000; }

@media screen and (max-width: 850px) {
  .row {
    padding-left: 1em;
    padding-right: 1em; }
    .row h1 {
      font-size: 1.5em !important; } }
@media screen and (min-width: 900px) {
  .row {
    width: 50%; } }

</style>
</html>
