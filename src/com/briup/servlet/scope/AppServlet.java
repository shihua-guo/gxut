package com.briup.servlet.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AppServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		//获取ServletContext类型的对象
//		HttpSession session = req.getSession();
//		ServletContext ac = session.getServletContext();
		
		ServletContext ac = req.getSession().getServletContext();
//		ServletContext ac = req.getServletContext();
		
		Integer count = (Integer) ac.getAttribute("num");
		if(count==null){
			count=1;
			ac.setAttribute("num", count);
		}
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h3>application:"+count+"</h3>");
		pw.flush();
		
		
		ac.setAttribute("num", ++count);
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
