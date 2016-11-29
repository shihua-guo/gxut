<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" session="true" buffer="8kb" autoFlush="true"  %>
    
<%@ page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@ include file="head.html" %> --%>
	<font size="8" color="red"><%=new Date().toLocaleString() %></font>
	<%=1+1 %><br>
	
	<%!
	
		private String str="hello,jsp";
	
		public int getNum(){
			return 10;
		}
		
		
		class Inner{
			
			private double data=10.10;
			
			public double getStr(){
				return data;
			}
		}
	
	%><br>
	
	<%=3>5 %><br>
	<%=10>1 && true %><br>
	<%=page %><br>
	<%=pageContext %><br>
	<%=request %><br>
	<%=response %><br>
	<%=session %><br>
	<%=application %><br>
	<%=out %><br>
	<%=config %><br>
	<%-- <%=10/0 %> --%>
	
	<%
	
		//int a=100;
	
		/* for(int i=0;i<=10;i++){
			
			out.println("i="+i+"<Br>");
		} */
		
		class Test{
			
			private String s="hello,jsp";
			public String getS(){
				return s;
			}
		}
		
	%>
	
	<%=new Inner().getStr() %><br>
	<%=getNum() %><br>
	<%=new Test().getS() %><br>
	<c:if test=""></c:if>
	
	
</body>
</html>








