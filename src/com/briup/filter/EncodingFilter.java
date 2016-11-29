package com.briup.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{

	public EncodingFilter() {
		// TODO Auto-generated constructor stub
		System.out.println("创建filter.....");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter销毁");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("filter exec..........");
		arg0.setCharacterEncoding("UTF-8");
		arg1.setCharacterEncoding("UTF-8");
		//将请求放行
		chain.doFilter(arg0, arg1);
		
		System.out.println("请求返回");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		System.out.println("filter初始化");
	}

}
