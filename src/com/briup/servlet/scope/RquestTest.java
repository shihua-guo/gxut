package com.briup.servlet.scope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RquestTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//主动向request范围放入age=20的数据
		req.setAttribute("age", 20);
		//如果key一样，value会被覆盖
		//req.setAttribute("age", 80);
		
		//获取request范围中age对应的数据
		Integer age=(Integer) req.getAttribute("age");
		
		System.out.println("request_age="+age);
		
		//服务器内部跳转，在servletA中是可以拿到age的值的
		//req.getRequestDispatcher("/A").forward(req, resp);
		
		//客户端重定向是，在servletA中是不可以拿到age的值的，因为不是同一个请求
		resp.sendRedirect("A");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
