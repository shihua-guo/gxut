package com.briup.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ParamServlet() {
    	System.out.println("构造函数调用");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println("username="+username);
		
		PrintWriter out = response.getWriter();
		out.println("username="+username);
		
		/*String pwd = request.getParameter("pwd");
		System.out.println("pwd="+pwd);
		String gender = request.getParameter("gender");
		System.out.println("gender="+gender);
		//String[] js = request.getParameterValues("js");
		//System.out.println("js="+Arrays.toString(js));
		
		String name = request.getParameter("name");
		System.out.println("name="+name);
		String city = request.getParameter("city");
		System.out.println("city="+city);
		
		Map<String, String[]> map = request.getParameterMap();
		Set<String> names = map.keySet();
		for(String s:names){
			System.out.println("s="+s);
			String[] ss = map.get(s);
			System.out.println(Arrays.toString(ss));
		}*/
		
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
