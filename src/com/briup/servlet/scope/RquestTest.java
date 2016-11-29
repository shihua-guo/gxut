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
		
		//������request��Χ����age=20������
		req.setAttribute("age", 20);
		//���keyһ����value�ᱻ����
		//req.setAttribute("age", 80);
		
		//��ȡrequest��Χ��age��Ӧ������
		Integer age=(Integer) req.getAttribute("age");
		
		System.out.println("request_age="+age);
		
		//�������ڲ���ת����servletA���ǿ����õ�age��ֵ��
		//req.getRequestDispatcher("/A").forward(req, resp);
		
		//�ͻ����ض����ǣ���servletA���ǲ������õ�age��ֵ�ģ���Ϊ����ͬһ������
		resp.sendRedirect("A");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
