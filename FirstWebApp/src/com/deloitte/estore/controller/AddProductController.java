package com.deloitte.estore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/addProduct")
public class AddProductController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId = Integer.parseInt(req.getParameter("txtpid"));
		String productName = req.getParameter("txtpname");
		float price = Float.parseFloat(req.getParameter("txtprice"));
		Product product = new Product(productId, productName, price);
		ProductService ps =new ProductServiceImpl();
		try {
			if(ps.addProduct(product)) {
				resp.sendRedirect("Success.jsp");
			}
			
		}
		catch(Exception e) {
			resp.sendRedirect("Error.jsp");
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId = Integer.parseInt(req.getParameter("txtpid"));
		String productName = req.getParameter("txtpname");
		float price = Float.parseFloat(req.getParameter("txtprice"));
		Product product = new Product(productId, productName, price);
		ProductService ps =new ProductServiceImpl();
		try {
			if(ps.addProduct(product)) {
				resp.sendRedirect("Success.jsp");
			}
			
		}
		catch(Exception e) {
			resp.sendRedirect("Error.jsp");
			e.printStackTrace();
		}
	}
	

}
