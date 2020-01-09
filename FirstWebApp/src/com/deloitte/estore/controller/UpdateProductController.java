package com.deloitte.estore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;


@WebServlet("/UpdateProduct")
public class UpdateProductController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -570773559525675692L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int productId = Integer.parseInt(req.getParameter("pidupdate"));
		String productName = req.getParameter("pnameupdate");
		float price = Float.parseFloat(req.getParameter("priceupdate"));
		Product product = new Product(productId, productName, price);
		ProductService ps =new ProductServiceImpl();
		HttpSession session =req.getSession();
		session.setAttribute("updatedproduct",product);
		try {
			if(ps.updateProduct(product)) {
				resp.sendRedirect("Updated.jsp");
			}
			
		}
		catch(Exception e) {
			resp.sendRedirect("Error.jsp");
			e.printStackTrace();
		}
		
	}

	
	
}
