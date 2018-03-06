<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/SpringHibernate/listAll">Create New Transaction</a> <br/>
	<a href="/SpringHibernate/get">Use Existing or create New Transaction</a> <br/>
	<a href="/SpringHibernate/listAndGet">First create new and then use existing</a> <br/>
	
		<div align="center">
            <h1>Contact List</h1>
            <table border="1">
                <th>No</th>
                <th>Username</th>
                <th>Email</th>
                 
                <c:forEach var="user" items="${userList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>

</body>
</html>