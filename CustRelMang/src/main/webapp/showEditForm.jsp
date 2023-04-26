<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AllUser</title>
</head>
<body>
	<h1>All Users</h1>

	<form action='userUpdateServlet' method='get'>
	 <input type="hidden" value='${userEdit.id}' name ="userId">
     Enter Name:
   	  <input type="text" name="name" value='${userEdit.name}'></br>
       Enter Email:
       <input type="text" name="email" value='${userEdit.email}'></br>
       Enter Phone:
       <input type="text" name="phone" value='${userEdit.phone}'></br>
       Enter Address:
       <input type="text" name="address" value='${userEdit.address}'></br>
       Enter Password:
       <input type="password" name="password" value='${userEdit.passwod}'></br>

    <input type='Submit' value='Update'>


    </form>



	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html>