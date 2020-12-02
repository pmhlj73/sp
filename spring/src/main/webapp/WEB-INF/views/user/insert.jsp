<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>

	<h1>회원 가입</h1>
	<form action="insertdata" method="post" enctype="multipart/form-data">
		<table border=1>
			<tr>
				<td>아이디</td>
				<td><input type=text name=userId></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type=password name=userPassword></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type=text name=userName></td>
			</tr>
			<tr>
				<td>프로필 사진
				<font size=1>사진 크기는 5mb를 넘을 수 없습니다.</font></td>
				<td><input type=file name=file></td>
			</tr>
			<tr >
			<td colspan=2><input type=submit value=저장><input type=reset value=취소></td>
			</tr>
		</table>
		
	</form>


</body>
</html>