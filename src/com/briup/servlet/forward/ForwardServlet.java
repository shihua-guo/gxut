package com.briup.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet{

	
	//���ʸ�servlet��ʱ��������ת��A.html��servlet----->page��
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet����");
		
		String name=req.getParameter("name");
		String page="";
		if("briup".equals(name)){
			page="/A.html";
		}else{
			page="/B.html";
		}
		
		//��ȡ��ת��ҳ��A.html������ַ�������
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		//��ת��A.html�����ҽ�request��response�����ڲ�ת�������ҳ��
		dispatcher.forward(req, resp);
		
	}

	
	
	//���ʸ�servlet��ʱ��������ת��ServletA��servlet----->servlet��
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPOST����");
		
		String name=req.getParameter("name");
		String servlet="";
		if("briup".equals(name)){
			servlet="/A";
		}else{
			servlet="/B";
		}
		
		//��ȡ��ת��ҳ��A.html������ַ�������
		RequestDispatcher request= req.getRequestDispatcher(servlet);
	}

	
}
