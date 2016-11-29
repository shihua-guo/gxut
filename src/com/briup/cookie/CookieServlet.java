package com.briup.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	
		resp.setContentType("text/html;charset=utf-8");
		
		
		//创建了两个cookie对象
		Cookie c1=new Cookie("name", "zhangsan");
		Cookie c2=new Cookie("age", "20");
		
		//默认是会话级别的Cookie，可以手动设置cookie的生命时间，单位是秒
		c1.setMaxAge(2*60*60*24*7);
		
		//将两个cookie对象写回浏览器
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>本次访问服务器所接受到的cookie有：</h1>"+"<a href='showCookie'>show</a>");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
	

}
