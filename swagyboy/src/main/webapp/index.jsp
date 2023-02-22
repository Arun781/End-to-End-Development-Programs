<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MetroCity</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALQAAAC0CAMAAAAKE/YAAAAAM1BMVEUAAAD///8gICDf39+goKC/v79AQEAQEBDv7++AgIBgYGBwcHDPz8+vr6+Pj49QUFAwMDAm7o5wAAADsUlEQVR4nO2Z2cKqIBRGTUAw1Hz/pz1mbcZNEZbn4v/WVdkWFvNQ1wEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMCfRF4e9FUB/fPLcJ7gW6e3AZBuB9JnAemzgPRZQPosIH0Wx6QHO4uNSS23YgIUKdU9cLZ5gXW/ox9f1uuG/pW0Hs0lQF2LmaxLGClkktkzC3Uv22wqmrJZWi+XFMFr9yqLjLW9tEvzN9K3qJZ5mQeWjbSctC/dT6RHTuRe2Wvyup4LkUsuHbTdL6TzBnfEXURPxcApyyLgF9IeoaRUkdmt4GxmuYUGgfL/SJvx+Vp/Ff5hn7+8GZJGEGmzqHstyHHj9QR6QNqEgymQEW6SvdKjaWUj10x6qlq22qVF8krvusJIT8hOJpH0XKXSSeDXpad80aIOa3T86pwGOushllZ1zs3SaT3fccPuUdUULPLiDZGlk36zFTgszcbTz4+qph59YyIpVR1+qewczdKF9GnN2Zt9etHmlJANs6jeOzZKF8J1UCaK5TckKig8ZVHr3LoilqKfLmL7eAt7QIb1gZTFxAZ+T3osRVtvSjsJwRMUKdia/lKaG1s7q48u7ZRi+vOk072cI9hwv9hUBaznSRejaSRWSw8t0tEkxUF510l/XNNN0jRyigc8WuXq+jQtdatTMYWB+KRJmpatpfA7tXcsbQvRLjk/e4j3Dh9Luw3CG4vKeXr2qQX+35bu6NhZ6NSKlS6Z0O9zVzGnH5Cm6ZR/Jdkhua8FExrW+wgRtf3jc2nX/mxVTwVpw+/yqNl0WILiAGiX1pQRs+3tgpuCZGvKnAF8ER97QBrDbAHHoK0+l/ZiuYdrhVya25wuUaxfl5gDwzV82iDtqjpLPLqRyc6Ic1JG7Q4gNH263pJZ76uDobWhQdqtL8ll3BAvaflpXERLzMCcxl3K8S2fuwZcdLN0uOAKOewJ9TZdhbl7D+W0wxL2XMrC3d72/rJVHJDW/v5kbzYhmDtD/obJqGUclzmMt6WU91AZPBFx3/9M2h/pGeinSPpF/FifMjVJm3Q5bXOl0RjfmuaX0xSfpFy8NT02ezzS5i3E2vHSHX/Xq5gpuXArvPjJp1V6OyjllW1G3ZWkuz6/6zT82sdEXlS4/rZLb8fnuCV35bJ0JqNscT/Xy6hGjIy3DEekt05yW9Q9eSP8n1DPv57oTjf8I8rHT9K+udJa7ayE2SameRnSwsVZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwF/mH5/yHFe0TR8QAAAAAElFTkSuQmCC" alt="" height="90px" width="150px"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#" style=" color: Red">Home <span class="sr-only">(current)</span></a>
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
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="swag">Register</a></button>
    </form>
  </div>
</nav>
<body>
<div class="index">
<b>Welcome to Swagy-Boy Details....</b>
</div>
</body>
<style>
    body{
        background-color: rgb(255, 140, 0);
    }
    .index{
        text-align: center;
        padding: 250px;
        font-size:70px ;
    }
</style>
</html>