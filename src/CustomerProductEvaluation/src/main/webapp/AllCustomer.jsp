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


    <table>
                <thead>
                   <tr>
                      <th>ID</th>
                      <th>address</th>
                      <th>email</th>
                      <th>name</th>
                      <th>Password</th>
                      <th>Phone</th>
                      <th>Edit</th>
                      <th>Delete</th>
                   </tr>
                </thead>
                <tbody>
                                   <!--   for (Customer cust: listCustomer) {  -->
                                   <c:forEach var="cust" items="${listCustomer}">

                                      <tr>
                                         <td><c:out value="${cust.id}" /></td>
                                         <td><c:out value="${cust.address}" /></td>
                                         <td><c:out value="${cust.email}" /></td>
                                         <td><c:out value="${cust.name}" /></td>
                                         <td><c:out value="${cust.password}" /></td>
                                         <td><c:out value="${cust.phone}" /></td>
                                         <td><a href="editServlet?id=<c:out value='${cust.id}' />">Edit</a></td>
                                          <td><a href="deleteServlet?id=<c:out value='${cust.id}'/>">Delete</a></td>
                                         <td></td>
                                      </tr>
                                   </c:forEach>
                                   <!-- } -->
                                </tbody>
                             </table>


	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html>