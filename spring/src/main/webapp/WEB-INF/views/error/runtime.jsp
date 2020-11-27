<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>

	<h1>Error !</h1>
	<p>
		애플리케이션에 오류발생. 관리자에게 문의하려면 pmhlj73@naver.com 또는
		010-0000-0000로 연락주세요
	</p>
	<!-- Failed URL : ${url} 
	Excption : ${exception.message}
	<c:forEach items="${exception.stackTrace}" var="ste"> ${ste} </c:forEach> -->

</body>
</html>