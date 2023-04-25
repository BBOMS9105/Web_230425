<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.ArrayList"%>
    
    
<%!
	String name = "";
	void test(){
	
	}
%>

<!-- html 주석 -->
<%-- JSP 주석 (Java 영역 안에선 사용 불가능) --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 자바 주석
	/* 그대로 사용 가능 */
	int a = 10;
	System.out.println(a);
	test();
	
	// html에 적어주는 역할
	out.println("<h1>hello world a = " + a + "</h1>");
	
%>
a의 값은 : <%= a %>

</body>
</html>