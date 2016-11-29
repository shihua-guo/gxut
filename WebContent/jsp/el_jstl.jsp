<%@page import="java.util.*"%>
<%@page import="com.briup.servlet.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" import="com.briup.servlet.Person"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${1+1 }<br>
	${1>2 }<br>
	${1>2 &&  true }<br>
	${pageContext.request }<br>
	${pageContext.response }<br>
	${pageContext.session }<br>
	${pageContext.session.id }<br>
	${pageContext.servletContext }<br>
	${pageContext.servletConfig }<br>
	
	${param.name }<br>
	${paramValues.js }<br>
	
	<c:forEach var="s" items="${paramValues.js }">
		${s }<br>
	</c:forEach>
	
	<%
	
		pageContext.setAttribute("name", "jack1");
		pageContext.setAttribute("score", 58);
		request.setAttribute("name", "jack2");
		session.setAttribute("name", "jack3");
		application.setAttribute("name", "jack4");
		
		Person p=new Person("zhangsan","20");
		Person p2=new Person("briup","10");
	
		session.setAttribute("person", p);
		session.setAttribute("p2", p2);
		
		String[] arr=new String[]{"s1","s2","s3","s4"};
		
		request.setAttribute("arr", arr);
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("wangwu","22"));
		list.add(new Person("lisi","25"));
		list.add(p);
		list.add(p2);
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hehe");
		map.put(2, "xxxx");
		map.put(3, "yyyy");
		map.put(4, "qqqq");
		Map<Integer,Person> map2=new HashMap<Integer,Person>();
		map2.put(1, p);
		map2.put(2, p2);
		map2.put(3, new Person("briup","20"));
		map2.put(4, new Person("lihong","18"));
		
		
		pageContext.setAttribute("list", list);
		pageContext.setAttribute("map", map);
		pageContext.setAttribute("map2", map2);
		
	%>
	
	${pageScope.name }<br>
	${requestScope.name }<br>
	${sessionScope.name }<br>
	${applicationScope.name }<br>
	
	${name }<br>
	
	${sessionScope.person.name }<br>
	${sessionScope.person.age }<br>
	
	<c:out value="hello,jsp&ampjava" escapeXml="false"></c:out><br>
	<c:out value="${name }" default="hehe...."></c:out><br>
	
	<c:set var="p" property="name" value="wangwu"></c:set>
	
	${requestScope.p.name }<br>
	
	<%-- <c:set target="${p2 }" property="name" value="lihong" scope="request"></c:set> --%>
	
	${requestScope.p2.name }
	
	<c:remove var="p" scope="session"/>
	
	${sessionScope.p }<br>
	
	<c:if test="${score<60 }">
		不及格
	</c:if>
	<c:if test="${score>=75 && score<85 }">
		良好
	</c:if>
	
	<c:if test="${score>=85 }">
		优秀
	</c:if>
	
	<c:choose>
		<c:when test="${score>=60 && score<75 }">
			及格
		</c:when>
		<c:when test="${score>=75 && score<=80 }">
			中等
		</c:when>
		<c:when test="${score>80 && score<90 }">
			良好
		</c:when>
		<c:when test="${score>=90}">
			优秀
		</c:when>
		<c:otherwise>
			不及格
		</c:otherwise>
	</c:choose>
	<br>
	<!-- for(String s:arr){syso(s)} -->
	<c:forEach var="s" items="${arr }" begin="1" end="2"  step="2" varStatus="num">
		${s }====${num.count }<br>
	</c:forEach>
	
	<c:forEach var="p" items="${list }" varStatus="num">
		${p }=====${p.name }====${p.age }====${num.count }<br>
	</c:forEach>
	
	
	<c:forEach var="m" items="${map }">
		${m.key }======${m.value }<br>
	</c:forEach>
	
	
	<c:forEach var="m2" items="${map2 }">
		${m2.key }======${m2.value.age }=====${m2.value.name }<br>
	</c:forEach>
</body>
</html>







