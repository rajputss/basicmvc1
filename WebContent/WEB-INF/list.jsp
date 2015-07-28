<%@page import="com.project.java.basicmvc1.domain.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" bordercolor="red">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>City</th>
			<th>Age</th>
			<th>Email</th>
		</tr>
		
		<%
			List<Student> students = (List<Student>) request.getAttribute("students");
			for (Student current : students) {
		%>
		<tr>
			<td> <%= current.getId() %></td>
			<td> <%= current.getFirstName() %></td>
			<td> <%= current.getLastName() %></td>
			<td> <%= current.getCity() %></td>
			<td> <%= current.getAge() %></td>
			<td> <%= current.getEmail() %></td>
		</tr>
		
		<%
			}
		%>	
	</table>

</body>
</html>