<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank details</title>
</head>
<body>
<div>
<h2>Here is your searched Customer details</h2>
<table>
<thead>
<th>Id </th>
<th>FirstName </th>
<th>LastName </th>
<th>Address </th>
<th> UserName</th>
<th> mailId</th>
<th> Password</th>
<th> MobileNo</th>
<th> Gender</th>
<th> CustomerId</th>
<th> GovtId</th>
<th> AccountNumber</th>
<th> BankName</th>

</thead>
<tbody>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.id}</td>
<td>${customer.firstName}</td>
<td>${customer.lastName}</td>
<td>${customer.address}</td>
<td>${customer.userName}</td>
<td>${customer.mailId}</td>
<td>${customer.password}</td>
<td>${customer.mobileNo}</td>
<td>${customer.gender}</td>
<td>${customer.customerId}</td>
<td>${customer.govtId}</td>
<td>${customer.accountNumber}</td>
<td>${customer.bankName}</td>
</tr>
</c:forEach>
</tbody>

</table>
</div>
</body>
</html>