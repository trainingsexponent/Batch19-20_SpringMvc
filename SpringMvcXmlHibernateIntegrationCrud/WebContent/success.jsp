<%@page import="com.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

function editData() {
	alert("Do you want Edit..?");
	document.mypage.action="edit";
	document.mypage.submit();
}

function deleteData() {
	alert("Do you want Delete..?");
	document.mypage.action="del";
	document.mypage.submit();
}
</script>
<body>
<%List<Customer> clist = (List) request.getAttribute("cl"); %>
<form name="mypage">
<table border="5">
    <thead>
       <tr>
         <th>SELECT</th>
         <th>ID</th>
         <th>NAME</th>
         <th>ADDRESS</th>
         <th>USERNAME</th>
         <th>PASSWORD</th>
         <th>EDIT</th>
         <th>DELETE</th>
       </tr>
    </thead>
    <tbody>
    <tr>
    <%for(Customer c : clist) { %>
    <td><input type="radio" name="id" value="<%=c.getId() %>"></td>
    <td><%=c.getId() %></td>
    <td><%=c.getCname() %></td>
    <td><%=c.getCaddress() %></td>
    <td><%=c.getUname() %></td>
    <td><%=c.getPass() %></td>
    <td><input type="submit" value="edit" onclick="editData()"></td>
    <td><input type="submit" value="delete" onclick="deleteData()"></td>
    </tr>
    <%} %>
    </tbody>
</table>
</form>
</body>
</html>