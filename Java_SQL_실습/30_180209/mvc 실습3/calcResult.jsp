<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2>연산 요청 결과</h2>
	<p>결과 :<%= request.getAttribute("rs") %></p>
	<a href="/mvc/htmlexam/calcForm.html">입력화면 돌아가기</a>
	

</body>
</html>