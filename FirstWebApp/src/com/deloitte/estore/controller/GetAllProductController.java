package com.deloitte.estore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/GetProducts")
public class GetAllProductController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService ps =new ProductServiceImpl();
		HttpSession session = req.getSession();
		List <Product> pList =null;
		try {
		pList = ps.getAllProducts();
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		session.setAttribute("products",pList);
		resp.sendRedirect("GetProducts.jsp");
		
	}

	
	
}
