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
 <div>
<h2>Here is your searched Bank details</h2><br>

${banks.id}
${banks.bankName}
${banks.branchName}
${banks.ifscCode}
${banks.address}

</div>


<h2>New Customer Registration</h2>
<form action="customersave" method="post">
<pre>
FirstName : <input type="text" name="firstName">
LastName : <input type="text" name="lastName" >
Address : <input type="text" name="address">
UserName : <input type="text" name="userName">
MailId : <input type="text" name="mailId">
Password : <input type="text" name="password">
MobileNo : <input type="text" name="mobileNo">
Gender : <input type="radio" name="gender" value="Male">
<input type="radio" name="gender" value="Female">
Bank Name :<input type="text" name="bankName">
Type of Account :<input type="checkbox">
GovtId	: <input type="text" name="govtId">
Initial Deposit		: <input type="radio" name="initialDeposit" value="500">
<input type="radio" name="initialDeposit" value="1000">

<input type="submit" value="CreateCustomer">
</pre></form>

<h3>Search Customer by Name</h3>
<form action="findcustomer" method="get">
<pre>
CustomerName	: <input type="text" name="firstName">
<input type="submit" value="SearchCustomer">
</pre></form>

<h3>Update Customer address by Name</h3>
<form action="updatecustomeraddress" method="get">
<pre>
Enter existing CustomerName	: <input type="text" name="firstName">
Enter address to be updated : <input type="text" name="address">
<input type="submit" value="UpdateAddress">
</pre></form>

<h3>Delete Existing Customer</h3>
<form action="deletecustomer" method="get">
<pre>
Enter Customer Name to be deleted	: <input type="text" name="firstName">
<input type="submit" value="DeleteCustomer">
</pre></form>

</body>
</html>