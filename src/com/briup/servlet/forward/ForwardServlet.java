package com.briup.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet{

	
	//访问该servlet的时候，让它跳转到A.html【servlet----->page】
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet请求");
		
		String name=req.getParameter("name");
		String page="";
		if("briup".equals(name)){
			page="/A.html";
		}else{
			page="/B.html";
		}
		
		//获取跳转到页面A.html的请求分发器对象
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		//跳转到A.html，并且将request和response对象内部转发给这个页面
		dispatcher.forward(req, resp);
		
	}

	
	
	//访问该servlet的时候，让它跳转到ServletA【servlet----->servlet】
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPOST请求");
		
		String name=req.getParameter("name");
		String servlet="";
		if("briup".equals(name)){
			servlet="/A";
		}else{
			servlet="/B";
		}
		
		//获取跳转到页面A.html的请求分发器对象
		RequestDispatcher request= req.getRequestDispatcher(servlet);
	}

	
}
