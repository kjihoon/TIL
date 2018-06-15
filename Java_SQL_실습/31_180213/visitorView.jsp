<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.vo.VisitorVO"%>
<%@ page import=" model.dao.VisitorDAO, java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<style>
body {
	text-align: center;
}

table {
	border-collapse: separate;
	border-spacing: 1px;
	line-height: 1.5;
	margin-left: auto;
	margin-right: auto;
	margin-top: 20px;
	margin-bottom: 20px;
	font-size: 0.9em;
}

table th {
	text-align: center;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	background: #ddacdb;
}

table  td {
	text-align: center;
	width: 25%;
	padding: 10px;
	vertical-align: top;
	border-bottom: 1.5px dashed grey;
}
</style>
</head>
<body>



	<%
		if (request.getAttribute("msg") != null) {
			String msg = (String)request.getAttribute("msg");
			VisitorVO vo = (VisitorVO) request.getAttribute("vo");

	%>
	
	<h2><%=vo.getName()%>님의 글 <%= msg %></h2>
    <a href ='/mvc/visitor'>방명록 리스트 보기</a>
	<%
		} else {
			ArrayList<VisitorVO> list = (ArrayList<VisitorVO>) request.getAttribute("list");
	%>
	<h1>방명록 리스트</h1>
	<hr>
	<table>
		<tr>
			<%
				for (VisitorVO v : list) {
			%>

			<td><%=v.getName()%></td>
			<td><%=v.getWriteDate()%></td>
			<td><%=v.getMemo()%></td>

		</tr>
		<%
			}
		%>
	</table>
	<a href='/mvc/htmlexam/visitor.html'>방명록 작성하기</a>
	<form method='get' action='/mvc/visitor'>
		<input type='search' name='name' required><input type='submit'
			value='검색'>
	</form>
	<%
		}
	%>


</body>
</html>