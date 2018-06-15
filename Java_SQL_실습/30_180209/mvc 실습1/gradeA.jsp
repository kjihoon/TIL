<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2> <%= request.getParameter("Name") %>님은 A등급 입니다. 우수한 성적이네요.</h2>
	<a href="/mvc/htmlexam/eduForm.html">성적입력화면으로 가기</a>

	
</body>
</html>