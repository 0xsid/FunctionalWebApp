<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.deloitte.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YEH TITLE HAI</title>


</head>

<%! Person p;
%>
<%  p = (Person)session.getAttribute("person"); %>
<body>
<div class="cc">

<h2 id="res"> Name: <%=p.getName() %></h2>
<h2 id="res"> Age: <%=p.getAge() %></h2>
<h2 id="res"> Gender: <%=p.getGender() %></h2>
</div>
</body>
<style>
#res{
border-style:dotted;
border-color:red;
}
</style>
</html>