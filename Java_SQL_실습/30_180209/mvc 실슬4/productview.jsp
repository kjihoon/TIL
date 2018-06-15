<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.vo.ProductVO" %>
    
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<h2>선택된 상품 저보는 다음과 같습니다.</h2>
	<hr>

    <% ProductVO pvo =(ProductVO) session.getAttribute("pvo"); %>
    
	<h3>선택된 사과의 개수 : <%=pvo.getApple() %></h3>
	<h3>선택된 사과의 개수 : <%=pvo.getBanana() %></h3>
	<h3>선택된 사과의 개수 : <%=pvo.getHalabong() %></h3>
	<a href="/mvc/htmlexam/product.html" style='background-color: red'>상품성택 화면</a>
	
</body>
</html>