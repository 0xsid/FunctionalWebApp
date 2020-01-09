package com.deloitte;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/perRedirect")
public class CubeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		long sum =  (long)req.getAttribute("sum");
		//HttpSession session =req.getSession();
		//Cookie cookies[] = req.getCookies();
		//long sum=0;
//		for(Cookie ck:cookies) {
//			if(ck.getName().equals("deloitte.sum")) {
//				sum = Long.parseLong(ck.getValue());
//				break;
//			}
//		}
		HttpSession session =req.getSession();
		Person per = (Person)req.getAttribute("person");
		//long cube = sum*sum*sum;
		session.setAttribute("person",per);
		res.sendRedirect("view.jsp");
	}

}
