package com.briup.servlet.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sessionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//获取session对象
		HttpSession session = req.getSession();
		
		System.out.println("JSESSIONID="+session.getId());
		
		//获取session中的num对应的数据
		Integer count = (Integer) session.getAttribute("num");
		if(count==null){
			count=1;
			session.setAttribute("num", count);
		}
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h3>session:"+count+"</h3>");
		pw.println("<a href="+resp.encodeUrl("session")+">click</a>");
		pw.flush();
		
		//手动让session失效
		//session.invalidate();
		
		session.setAttribute("num", ++count);
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
