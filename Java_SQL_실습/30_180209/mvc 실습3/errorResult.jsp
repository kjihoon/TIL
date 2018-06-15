<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2>요청을 처리하는 동안 오류가 발생되었다.</h2>
	<h3>오료의 원인: <span style='color: red'><%= request.getAttribute("err") %> </span></h3>
	
	<a href="/mvc/htmlexam/calcForm.html">입력화면 돌아가기</a>
</body>
</html>