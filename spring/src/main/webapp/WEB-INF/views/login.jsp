<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h1>로그인</h1>
${message}
<form action="login.do" method=post>
아이디 : <input type=text name=id><br>
비밀번호 : <input type=password name=pw><br>
<input type=submit value=로그인>
</form>
<h5>아이다가 없으시다면 <a href="user/insert">회원가입</a>을 눌러주세요.</h5>
</body>
</html>