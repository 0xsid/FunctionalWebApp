package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.servlet4preview.RequestDispatcher;

public class ShowServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//		int num1 = Integer.parseInt(req.getParameter("t1"));
//		int num2 = Integer.parseInt(req.getParameter("t2"));
//		int sum = num1+num2;
//		res.getWriter().println("Sum = "+sum);
		
		String name = req.getParameter("txtname");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		List<String>langs = Arrays.asList(req.getParameterValues("cblang"));
		
		PrintWriter out = res.getWriter();
		//res.getWriter().println("Sum = "+sum);
	//langs.forEach((l)->out.println(l));
	out.println("Name: "+ name+"<br>");
	out.println("Gender: "+ gender+"<br>");
	out.println("Languages: "+langs.toString()+"<br>");
	out.println("Country: "+country+"<br>");
	int sum =5;
    
	
	}

}
