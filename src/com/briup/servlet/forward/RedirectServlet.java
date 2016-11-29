package com.briup.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{

	
	//���ʸ�servlet��ʱ�����ض���A.html��servlet--�ض���--->page��
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet����");
		
		String name=req.getParameter("name");
		String page="";
		if("briup".equals(name)){
			page="A.html";
		}else{
			page="B.html";
		}
		
		//�ض���pageҳ��
		resp.sendRedirect(page);
		
	}

	
	
	//���ʸ�servlet��ʱ�������ض���ServletA��servlet--�ض���--->servlet��
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPOST����");
		
		String name=req.getParameter("name");
		String servlet="";
		if("briup".equals(name)){
			servlet="A";//ע�⣺�ض����ʱ��·����ǰ�治��"/"
		}else{
			servlet="B";
		}
		//�ض���servlet
		resp.sendRedirect(servlet);
	}

	
}
