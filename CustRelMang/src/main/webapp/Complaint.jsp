<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register</title>
</head>
<body>
	<h1>Register Your Complaint</h1>
	<%
	String email = request.getParameter("email");
	out.println(email);
	%>

	<form method="get" action="SaveIssue">

	Enter Name:
	<input type="text" name="name"></br>
    Select Any Of the Issue:
    <input type="radio" name="issue" value="form1"> Form1<br>
    <input type="radio" name="issue" value="kyc form"> KYC Form<br>
    <input type="radio" name="issue" value="change mobile no"> Change Mobile Number<br>
    If any other issue :
    <input type="text" name="other" placeholder="NIL"></br>

    <input type="Submit" value="Register The Complaint">

	</form>





	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html>