<%@page import="com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%Customer customer = (Customer) request.getAttribute("c"); %>
<body>
<form action="up">
 <input type="hidden" name="id" value="<%=customer.getId()%>"><br><br>
Name :<input type="text" name="cname" value="<%=customer.getCname()%>"><br><br>
Address : <input type="text" name="caddress" value="<%=customer.getCaddress()%>"><br><br>
Username : <input type="text" name="uname" value="<%=customer.getUname()%>"><br><br>
Password : <input type="password" name="pass" value="<%=customer.getPass()%>"><br><br>
  <input type="submit" value="Upadte">
</form>
</body>
</html>