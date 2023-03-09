<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updated Customer details</title>
</head>
<body>
<div>
<h2>Here is your Updated Customer details</h2>
<table>
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
<c:forEach var="update" items="${updates}">
<tr>
<td>${update.id}</td>
<td>${update.firstName}</td>
<td>${update.lastName}</td>
<td>${update.address}</td>
<td>${update.userName}</td>
<td>${update.mailId}</td>
<td>${update.password}</td>
<td>${update.mobileNo}</td>
<td>${update.gender}</td>
<td>${update.customerId}</td>
<td>${update.govtId}</td>
<td>${update.accountNumber}</td>
<td>${update.bankName}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>