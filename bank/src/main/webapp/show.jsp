<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank details</title>
</head>
<body>
<div>
<h2>Here is your searched Bank details</h2>
<table>
<thead>
<th>Id</th>
<th>BankName</th>
<th>BranchName</th>
<th>IfscCode</th>
<th>Address</th>

</thead>
<tbody>
<c:forEach var="bank" items="${banks}">
<tr>
<td>${bank.id}</td>
<td>${bank.bankName}</td>
<td>${bank.branchName}</td>
<td>${bank.ifscCode}</td>
<td>${bank.address}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<form action="custreg" method="post">
<input type="submit" value="Click_here_for_customer_registration">
</form>
</body>
</html>