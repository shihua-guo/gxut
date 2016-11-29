package com.briup.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		doPost(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//将浏览器发送过来的请求封装成了HttpServletRequest类型的对象
		//将对browser的响应封装成了HttpServletResponse类型的对象
		
		//告诉浏览器你响应内容的是什么
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
			pw.println("<head>");
				pw.println("<title>html page</title>");
			pw.println("</head>");
			pw.println("<body>");
				pw.println("<table border='1' width=200>");
					pw.println("<tr>" +
							"<td>name</td>" +
							"<td>age</td>" +
							"</tr>");
					pw.println("<tr>" +
							"<td>xm</td>" +
							"<td>20</td>" +
							"</tr>");
					pw.println("<tr>" +
							"<td>zs</td>" +
							"<td>18</td>" +
							"</tr>");
				pw.println("</table>");
			pw.println("</body>");
		pw.println("</html>");
		
		pw.flush();
		
	}

	
	
}
