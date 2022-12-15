<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Word Register</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"></link>

</head>
<body>
	<jsp:include page="/WEB-INF/views/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">단어 추가</h1>
		</div>
	</div>
	<div class="container">
		<div align=center>
			<form name=form1
				action="http://localhost:8080/JSM_free/word/register/" method="post">
				<div class="form-group row">
					<label class="col-sm-7">단어 ID</label>
					<div class="col-sm-20">
						<input type="text" name="w_id" value="${word.w_id}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-7">목록 ID</label>
					<div class="col-sm-20">
						<input type="text" name="l_id" value="${word.l_id}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-7">단어 이름</label>
					<div class="col-sm-20">
						<input type="text" name="w_title" value="${word.w_title}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-7">단어 설명</label>
					<div class="col-sm-20">
						<input type="text" name="w_desc" value="${word.w_desc}">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-7">단어 추가 설명</label>
					<div class="col-sm-20">
						<input type="text" name="w_extra" value="${word.w_extra}">
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-offset-2 col-sm-10 ">
						<input type="submit" name="submit" class="btn btn-primary" value="확인">
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>