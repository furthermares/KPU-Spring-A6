<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Word List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"></link>
</head>
<body>
	<jsp:include page="/WEB-INF/views/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">단어 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			<c:forEach var="word" items="${words}">
				<div class="col-md-3">
					<h3>${word.w_title}</h3>
					<p>${word.w_desc}
					<p>
						<c:url value="/word/read?id=${word.w_id}" var="url" />
						<a href="${url}" class="btn btn-info" role="button"> 단어 조회
							&raquo;></a>

						<c:url value="/word/modify?id=${word.w_id}" var="url" />
						<a href="${url}" class="btn btn-success" role="button"> 단어
							수정&raquo;></a>

						<c:url value="/word/delete?id=${word.w_id}" var="url" />
						<a href="${url}" class="btn btn-danger" role="button"> 단어
							삭제&raquo;></a>
				</div>
			</c:forEach>
		</div>
		<div class="row" align="right">
			<H1 align="right">
				<c:url value="/word/register" var="url" />
				<a href="${url}" class="btn btn-info" role="button">단어 추가&raquo;></a><br>
			</H1>
		</div>
	</div>
</body>
</html>