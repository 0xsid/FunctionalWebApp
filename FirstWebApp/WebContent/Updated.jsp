<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.deloitte.estore.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Product product = (Product)session.getAttribute("updatedproduct"); 
//PrintWriter out = resp.getWriter(); 
%>
<h3>Product Updated Successfully!</h3><br>
<table border=1>
<tr>
<th>
Product Id
</th>
<th>
Product Name
</th>
<th>
Product Price
</th>
</tr>
<%

	out.println("<tr>");
	out.println("<td>"+product.getProductId()+"</td>");
	out.println("<td>"+product.getProductName()+"</td>");
	out.println("<td>"+product.getPrice()+"</td>");
	out.println("</tr>");
%>
</body>
</html>