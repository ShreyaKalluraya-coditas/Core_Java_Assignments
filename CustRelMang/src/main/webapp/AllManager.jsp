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
                                   <!--   for (Manager manager: listManager) {  -->
                                   <c:forEach var="manager" items="${listManager}">

                                      <tr>
                                         <td><c:out value="${manager.id}" /></td>
                                         <td><c:out value="${manager.address}" /></td>
                                         <td><c:out value="${manager.email}" /></td>
                                         <td><c:out value="${manager.name}" /></td>
                                         <td><c:out value="${manager.passwod}" /></td>
                                         <td><c:out value="${manager.phone}" /></td>
                                         <td><a href="ManagereditServlet?id=<c:out value='${manager.id}' />">Edit</a></td>
                                          <td><a href="ManagerdeleteServlet?id=<c:out value='${manager.id}'/>">Delete</a></td>
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