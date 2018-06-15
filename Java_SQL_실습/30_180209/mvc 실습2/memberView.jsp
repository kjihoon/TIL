<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "model.vo.MemberVO" %>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<%
		MemberVO vo = (MemberVO)request.getAttribute("mb");
	%>
	<h2>회원 정보</h2>
	<hr>
	<ul>
	
		<li>회원 이름 : <%=vo.getName() %></li>
		<li>회원 계정 : <%=vo.getAcc() %> </li>
		<li>회원 암호 : <%=vo.getPass() %> </li>
		<li>회원 전화 번호 : <%=vo.getTel() %> </li>
	</ul>
</body>
</html>