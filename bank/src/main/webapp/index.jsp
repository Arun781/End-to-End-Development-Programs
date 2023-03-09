<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

 <!DOCTYPE html>
 <html>
<body>
<div align="left"  >
<h2>Welcome to online Banking Project</h2>

<!-- <form action="">
<input type="submit" value="Click_here_for_SignUp"> 
</form> -->


<form action="banksave" method="post">
<pre>
BankName	: <input type="text" name="bankName">
BranchName	: <input type="text" name="branchName">
IfscCode	: <input type="text" name="ifscCode">
Address		: <input type="text" name="address">
<input type="submit" value="CreateBank">
</pre></form>

<h3>Search Bank by Name</h3>
<form action="findbank" method="get">
<pre>
BankName	: <input type="text" name="bankName">
<input type="submit" value="SearchBank">
</pre></form>


<!-- <h3>Update Bank address by Name</h3>
<form action="updatebankaddress" method="get">
<pre>
Enter existing BankName	: <input type="text" name="bankName">
Enter address to be updated : <input type="text" name="address">
<input type="submit" value="UpdateAddress">
</pre></form>
<h3>Old Bank deleting ceremony</h3>
<form action="deletebank" method="get">
<pre>
Enter BankName to be deleted	: <input type="text" name="bankName">
<input type="submit" value="DeleteBank">
</pre></form>
 -->
</div>
</body>
</html>
</body>
</html>