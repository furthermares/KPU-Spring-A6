<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Word Info</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"></link>
</head>
<body>
	<jsp:include page="/WEB-INF/views/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">${word.l_id}</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="left">
			<div class="col-md-2">
				<h3>${word.w_title}</h3>
				<li>${word.w_desc}</li>
				<li>${word.w_extra}</li>
			</div>
		</div>
		<div class="container" align="right">
			<a onclick="history.go(-1)" class="btn btn-info" role="button">
				뒤로가기 &raquo;></a>
		</div>

		<H1 align="right">
			<c:url value="/word/modify?id=${word.w_id}" var="url" />
			<a href="${url}" class="btn btn-success" role="button"> 단어
				수정&raquo;></a>

			<c:url value="/word/delete?id=${word.w_id}" var="url" />
			<a href="${url}" class="btn btn-danger" role="button"> 단어
				삭제&raquo;></a>
		</H1>
	</div>
</body>
</html>