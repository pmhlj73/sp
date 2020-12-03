<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myPage</title>
</head>
<body>
<img src='<c:url value="/img/${user.fileId}"/>' width=100 class="img-thubmnail">
<h2>안녕하세요 ${user.userName}님!</h2>

</body>
</html>