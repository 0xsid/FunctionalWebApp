<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#header{
text-align:center;
}


</style>
</head>
<body id="body">
<div id="header"><h1><em>Inventory Manager Portal</em></h1></div>
<h2>Add Product</h2>
<form action="addProduct">
Enter Product Id: <input type="number" name ="txtpid">
Enter Product Name: <input type="text" name="txtpname">
Enter Price: <input type="number" name = "txtprice">
<input type="submit" value="Save Product">
</form>
<h2>Fetch All Product Records</h2>
<form action="GetProducts">
<input type="submit" value="Get All Products">
</form>
<h2>Get Product By Id</h2>
<form action="SearchProduct">
Enter Product Id: <input type="number" name ="pidsearch">
<input type="submit" value="Search By ID">
</form>
<h2>Delete Product</h2>
<form action="DeleteProduct">
Enter Product Id: <input type="number" name ="piddelete">
Enter Product Name: <input type="text" name="pnamedelete">
Enter Price: <input type="number" name = "pricedelete">
<input type="submit" value="Delete Product">
</form>
<h2>Update Product</h2>
<form action="UpdateProduct">
Enter Product Id: <input type="number" name ="pidupdate">
Enter Product Name: <input type="text" name="pnameupdate">
Enter Price: <input type="number" name = "priceupdate">
<input type="submit" value="Update Product">
</form>
<script type="text/javascript" src="bParticles/bParticles.js"></script>
<script>
bParticles("bParticles/bParticles.json", "body", function(particlesID){
	  console.log("bParticles initiliazed with ID #" + particlesID);
	});
</script>
</body>

</html>