<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.deloitte.estore.model.Product,java.util.List,java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Product> products = (List<Product>)session.getAttribute("products"); 
//PrintWriter out = resp.getWriter(); 
%>
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
for(Product p:products){
	out.println("<tr>");
	out.println("<td>"+p.getProductId()+"</td>");
	out.println("<td>"+p.getProductName()+"</td>");
	out.println("<td>"+p.getPrice()+"</td>");
	out.println("</tr>");
}

%>



</table>
</body>
</html>