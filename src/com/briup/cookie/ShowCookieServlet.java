package com.briup.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowCookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cookie[] cookies = req.getCookies();
		if(cookies==null){
			cookies=new Cookie[0];
		}
		
		PrintWriter pw = resp.getWriter();
		
		for(Cookie c:cookies){
			
			String name=c.getName();
			String value=c.getValue();
			pw.println("<h1>name:"+name+" value:"+value+"</h1>");
			
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
	

}
