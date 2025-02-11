<%@page import="ex1.vo.Test4VO"%>
<%@page import="ex1.vo.Test3VO"%>
<%@page import="ex1.vo.Test2VO"%>
<%@page import="ex1.vo.TestVO"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 준비된 환경설정 파일(config.xml)을 로드한다.
	BeanFactory bf = new ClassPathXmlApplicationContext("config.xml");
	// 이때 config.xml에 정의된 모든 bean들이 생성된다.
	
	// 사용자가 원하는 bean객체를 얻어내자(id가 t1인 객체)
	TestVO tt = (TestVO)bf.getBean("t1");
	
	Test2VO t2 = (Test2VO)bf.getBean("t2");
	
	Test3VO t3 = (Test3VO)bf.getBean("t3");
	
	// 클래스의 유형(자료형)을 가지고 bean객체를 검색한다.
	Test4VO t4 = bf.getBean(Test4VO.class); 

%>
	<h1><%=tt.getMsg()%></h1>
	<h1><%=t2.getStr()%> / <%=t2.getValue()%></h1>
	<h1><%=t3.getName()%> / <%=t3.getAge()%> / <%=t3.isLive()%></h1>
	<h1><%=t4.getTest().getStr()%> / <%=t4.getTest().getValue()%></h1>
</body>
</html>