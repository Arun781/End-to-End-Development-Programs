<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" isELIgnored="false"%>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>${cust.firstName} registered for ${cust.bankName} bank</h4>
Registered AccountNo is : ${cust.accountNumber}<br>
Customer Id for registered bank is : ${cust.customerId}



</body>
</html>