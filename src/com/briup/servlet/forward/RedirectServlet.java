package com.briup.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{

	
	//访问该servlet的时候，让重定向到A.html【servlet--重定向--->page】
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet请求");
		
		String name=req.getParameter("name");
		String page="";
		if("briup".equals(name)){
			page="A.html";
		}else{
			page="B.html";
		}
		
		//重定向到page页面
		resp.sendRedirect(page);
		
	}

	
	
	//访问该servlet的时候，让它重定向到ServletA【servlet--重定向--->servlet】
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPOST请求");
		
		String name=req.getParameter("name");
		String servlet="";
		if("briup".equals(name)){
			servlet="A";//注意：重定向的时候路径最前面不加"/"
		}else{
			servlet="B";
		}
		//重定向到servlet
		resp.sendRedirect(servlet);
	}

	
}
