package com.deloitte.estore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3930351434029765893L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ProductServiceImpl ps = new ProductServiceImpl();
		int productId = Integer.parseInt(req.getParameter("piddelete"));
		String productName = req.getParameter("pnamedelete");
		float price = Float.parseFloat(req.getParameter("pricedelete"));
		Product product = new Product(productId, productName, price);
		try {
			if(ps.deleteProduct(product)) {
				res.sendRedirect("Success.jsp");
			}
			
		}
		catch(Exception e) {
			res.sendRedirect("Error.jsp");
			e.printStackTrace();
		}
	}

	
	
}
