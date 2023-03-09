<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<title>Hotel-Regester</title>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Registration Form</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"><img src="https://qph.cf2.quoracdn.net/main-qimg-5e2b6b4e3e08ff7942a9188d359d2dba.webp" alt="" height="90px" width="150px"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp" style=" color: Red">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" style=" color: Red">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" style=" color: Red" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#" style=" color: Red">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="HotelSearch.jsp">SearchById</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="SearchByName.jsp">SearchByName</a></button>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
  </div>
</nav>
<form action="hotelRegester" method="post">
<div class="formbold-main-wrapper">
    <div class="formbold-form-wrapper">
       <span style="color: rgb(40, 1, 1); text-align: center">
       <h1><b>Hotel Registration Form</b></h1></span>
       <br>
       <br>

       
        <div class="formbold-input-flex">
          <div>
            <label for="firstname" class="formbold-form-label"><b> First Name</b> </label>
            <input
              type="text"
              name="firstName"
              id="firstname"
              placeholder="Your first name"
              class="formbold-form-input"
            />
          </div>
  
          <div>
            <label for="lastname" class="formbold-form-label"><b>Last Name</b>  </label>
            <input
              type="text"
              name="lastName"
              id="lastname"
              placeholder="Your last name"
              class="formbold-form-input"
            />
          </div>
        </div>
  
        <div class="formbold-input-flex">
          <div>
              <label  class="formbold-form-label"><b> Email </b></label>
              <input
              type="text"
              name="email"
              placeholder="example@email.com"
              class="formbold-form-input"
              />
          </div>
  
          <div>
              <label class="formbold-form-label"><b>Gender</b></label>
              <select class="formbold-form-input" name="gender" id="occupation">
              <option value="">gender</option>
                    <c:forEach items="${gender}" var="g">
                        <option value="${g}">${g}</option>
                    </c:forEach>
              </select>
          </div>
        </div>
  
       
            <div class="formbold-input-flex">
              <div>
                <label for="pinCode" class="formbold-form-label"> <b>Pin-Code</b> </label>
                <input
                  type="text"
                  name="pinCode"
                  id="pinCode"
                  placeholder="Area Pin Code"
                  class="formbold-form-input"
                />
              </div>
      
              <div>
                <label for="phoneNum" class="formbold-form-label"><b> Phone Num </b></label>
                <input
                  type="text"
                  name="phoneNum"
                  id="phoneNum"
                  placeholder="Phone Num"
                  class="formbold-form-input"
                />
              </div>
            </div>
      
        
  
        <div class="formbold-mb-3">
          <label for="address" class="formbold-form-label"><b> Address </b></label>
  
          <input
            type="text"
            name="address"
            id="address"
            placeholder="Street address"
            class="formbold-form-input formbold-mb-3"
          />
         
        </div>
  
        <div class="formbold-mb-3">
          <label for="message" class="formbold-form-label">
            <b>Cover Letter</b>
          </label>
         <input
         
            rows="6"
            name="message"
            id="message"
            class="formbold-form-input"
          />
        </div>
  
   <button class="formbold-btn"><b>Apply Now</b></button>
     </div>
  </div>
  </form>
      
  
   
  <style>
 @import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');
* {
margin: 0;
padding: 0;
box-sizing: border-box;
background-image: url("");
}

body {
font-family: 'Inter', sans-serif;
background-image: url("https://images.pexels.com/photos/2017802/pexels-photo-2017802.jpeg?auto=compress&cs=tinysrgb&w=600");
/* Center and scale the image nicely */
background-position: center;
background-repeat: repeat-y;
background-size: cover;
}
.img{
  margin-bottom: auto;
  margin-top: auto;
  margin-left:0px;
  margin-right: 500px;
  image-rendering: optimizeQuality;
}
    .formbold-mb-3 {
      margin-bottom: 15px;
    }
  
    .formbold-main-wrapper {
      display: flex;
      align-items: center;
      justify-content: center;
      padding: 30px;
    }
  
    .formbold-form-wrapper {
      margin-left:1000px;
      margin-right: 0;
      max-width: 570px;
      border-radius: 25px;
      width: 100%;
      background: rgb(201, 101, 13);
      padding: 40px;
      color: #01182c;
      box-shadow:rgb(201, 101, 13);
    }
  
    .formbold-img {
      display: block;
      margin: 0 auto 45px;
    }
  
    .formbold-input-wrapp > div {
      display: flex;
      gap: 20px;
    }
  
    .formbold-input-flex {
      display: flex;
      gap: 20px;
      margin-bottom: 15px;
    }
    .formbold-input-flex > div {
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
    .formbold-form-input::placeholder,
    select.formbold-form-input,
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
      background-color: #080545;
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
