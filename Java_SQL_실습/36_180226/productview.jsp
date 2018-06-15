<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="vo.ProductVO" %>
    
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2>선택된 상품 정보는 다음과 같습니다.</h2>
	<hr>
	
    
	<h3>선택된 사과의 개수 : ${product.apple}</h3>
	<h3>선택된 바나나의 개수 : ${product.banana}</h3>
	<h3>선택된 한라봉의 개수 :${product.halabong}</h3>
	<a href="/springedu/product.html" style='background-color: red'>상품성택 화면</a>
	
</body>
</html>