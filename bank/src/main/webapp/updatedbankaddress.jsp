<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updated Bank details</title>
</head>
<body>
<div>
<h2>Here is your Updated Bank details</h2>
<table>
<thead>
<th>Id </th>
<th>BankName </th>
<th>BranchName </th>
<th>IfscCode </th>
<th>Address </th>
</thead>
<tbody>
<c:forEach var="update" items="${updates}">
<tr>
<td>${update.id}</td>
<td>${update.bankName}</td>
<td>${update.branchName}</td>
<td>${update.ifscCode}</td>
<td>${update.address}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>