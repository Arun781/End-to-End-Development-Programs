 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AeroplaneRegister</title>
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
                    <b>Dropdown</b>
            </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="#">Action</a></li>
                    <li><a class="dropdown-item" href="#">Another action</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul></li>
            <li class="nav-item"><a class="nav-link disabled" href="#"
                tabindex="-1" aria-disabled="true">Disabled</a></li>
        </ul>
<button class="btn btn-outline-success my-2 my-sm-0"><a href="AeroplaneSearch.jsp">Search</a></button>
    </div>
</div>
</nav>
<body>
<form action="aeroplane" method="post">
<div class="formbold-main-wrapper">
    <div class="formbold-form-wrapper">
        <img
            src="https://x-workz.in/static/media/coding_img.bef297f81da57125500a.png"
            width="400px" height="400px">
            

<h1>
    <b style="color: Purple" >Welcome to Air-lines Data Saving...</b>
</h1>
<br>
<br>

<c:forEach items="${error}" var="e">
<span style="color: red;">${e.message}</span><br>
</c:forEach>	

        <form action="bigBasket" method="post">

            <div class="formbold-input-flex">
                <div>
                    <label for="companyName" class="formbold-form-label"><b>CompanyName</b> </label>
                             <input type="text" name="companyName"
                        id="companyName" placeholder="companyName"
                        class="formbold-form-input"  value="${aeroplaneDTO.companyName}"/>
                </div>
                <div>
                    <label for="AeroplaneName" class="formbold-form-label"><b>AeroplaneName</b>
                    </label> <input type="text" name="aeroplaneName"  value="${aeroplaneDTO.aeroplaneName}" id="AeroplaneName"
                        placeholder="AeroplaneName" class="formbold-form-input" />
                </div>
            </div>
            <div class="formbold-input-flex">
                
                <div>
                    <label for="PassangerName" class="formbold-form-label"> <b>PassangerName</b>
                    </label> 
                    <input type="text" name="passangerName"  value="${aeroplaneDTO.passangerName}" placeholder="PassangerName"
                        class="formbold-form-input" />
                        
                     <label for="Enter Your Gamil-Id"
                        class="formbold-form-label"> <b>Gamil-Id</b>
                    </label> <input type="email" name="gmail"  value="${aeroplaneDTO.gmail}"
                        placeholder="Enter Your Gamil-Id" class="formbold-form-input" />
                </div>

                <div>
                    <label class="formbold-form-label"><b>Class Type</b></label> <select
                        class="formbold-form-input" name="classType" id="classType">
                        <option value="">classType</option>
                        <c:forEach items="${classType}" var="c">
                            <option value="${c}">${c}</option>
                        </c:forEach>
                    </select> <label class="formbold-form-label"><b>CountryName</b></label> <select
                        class="formbold-form-input" name="countryName" id="Country">
                        <option value="">countryNames</option>
                        <c:forEach items="${countryNames}" var="C">
                            <option value="${C}">${C}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
           
            <div class="formbold-input-flex">
                <div>
                    <label for="TicketCost" class="formbold-form-label"><b>TicketCost</b>
                    </label> <input type="text" name="ticketCost"  value="${bigBasketDTO.price}" id="TicketCost"
                        placeholder="TicketCost" class="formbold-form-input" />
                </div>
                <div>
                    <label for="EnterPlanenumber" class="formbold-form-label"><b>EnterPlanenumber</b>
                    </label> <input type="text" name="enterPlanenumber" value="${bigBasketDTO.EnterPlanenumber}" id="EnterPlanenumber"
                        placeholder="EnterPlanenumber" class="formbold-form-input" />
                </div>
            </div>
            
            <input class="formbold-btn" type="submit" value="Apply" />
        </form>
    </div>
</div>
</form>
<style>
@import
url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');
* {
margin: 0;
padding: 0;
box-sizing: border-box;
border-radius: 25px;
ba
}

body {
font-family: 'Inter', sans-serif;
background-color: blueviolet;
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