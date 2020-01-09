package com.deloitte;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/person")
public class SumServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		long n1 = Long.parseLong(req.getParameter("num1"));
//		long n2 = Long.parseLong(req.getParameter("num2"));
//		long sum = n1+n2;
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		int age = Integer.parseInt(req.getParameter("age"));
		Person per = new Person(name,age,gender);
		
		//req.setAttribute("sum", sum);
		
//		RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
//	    req.setAttribute("person",per);
//	    rd.forward(req, res);
		HttpSession session =req.getSession();
//		
////		Cookie cookie = new Cookie("deloitte.person",String.valueOf(sum));
		session.setAttribute("person",per);
////		res.addCookie(cookie);
		res.sendRedirect("view.jsp");
	}

	
	
	
}
