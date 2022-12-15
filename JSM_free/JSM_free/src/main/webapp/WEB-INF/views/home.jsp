<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Word List</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"></link>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">과제6: 암기장</h1>
		</div>
	</div>
	<div align=center>
		<c:url value="/word/list" var="url"/><a href="${url}">단어 목록</a>
		<br>
		<br>
		<c:url value="/word/quiz" var="url"/><a href="${url}">Transaction 테스트용 퀴즈</a>
	</div>
</body>
</html>
