package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo {

	@Override
	public boolean addProduct(Product product) throws Exception{
		Connection con = getDbConnection();
		PreparedStatement pr = con.prepareStatement("insert into product_details values(?, ?, ?)");
		pr.setInt(1, product.getProductId());
		pr.setString(2, product.getProductName());
		pr.setDouble(3, product.getPrice());
		
		int r = pr.executeUpdate();
		return (r > 0);
	}

	@Override
	public boolean deleteProduct(Product product) throws Exception{

		Connection con =getDbConnection();
		PreparedStatement pr = con.prepareStatement("delete from product_details where pid = ?");
		pr.setInt(1, product.getProductId());
		
		int r = pr.executeUpdate();
		return (r > 0);
	}

	@Override
	public boolean updateProduct(Product product) throws Exception{
		Connection con =getDbConnection();
		PreparedStatement pr = con.prepareStatement("update product_details set pname = ?, price = ? where pid = ?");
		pr.setString(1, product.getProductName());
		pr.setDouble(2, product.getPrice());
		pr.setInt(3, product.getProductId());
		
		int r = pr.executeUpdate();
		return (r > 0);
	}

	@Override
	public Product getProductById(int productId) throws Exception{
		Connection con =getDbConnection();
		PreparedStatement pr = con.prepareStatement("select * from product_details where pid = ?");
		pr.setInt(1, productId);
		int id=0;
		String name=null;
		Double price=0.000;
		ResultSet r = pr.executeQuery();
		while(r.next()) {
		 id = r.getInt(1);
		 name = r.getString(2);
			 price = r.getDouble(3);
		}
		
		
		Product p = new Product(id, name, price);
		return p;
	}

	@Override
	public List<Product> getAllProducts() throws Exception{
		Connection con =getDbConnection();
		Statement smt = con.createStatement();
		ResultSet r= smt.executeQuery("select * from product_details");
		List<Product> ls = new ArrayList<>();
		while(r.next()) {
			Product p = new Product(r.getInt(1),r.getString(2),r.getDouble(3));
		ls.add(p);
		}
      return ls;
	}

	@Override
	public Connection getDbConnection() throws Exception {
		//Create Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		
		if(con!=null)
			System.out.println("Connection successful");
		return con;
	}

	
	
	
	
}
