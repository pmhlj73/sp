<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 입력</title>
</head>
<body>
<form action="/a" method="post" enctype="mulitpart/form-data">
</form>
	<form:form action="insert" method="post" modelAttribute="mem">
	<h1>정보 입력</h1>
	<table border=1>
	<tr>
	<th>User_index</th>
	<td><form:input path="userIndex"/>
	<form:errors path="userIndex" /></td>
	</tr>
	<tr>
	<th>User_id</th>
	<td><form:input path="userId"/>
	<form:errors path="userId" /></td>
	</tr>
	<tr>
	<th>User_password</th>
	<td><form:input path="userPassword"/>
	<form:errors path="userPassword"/></td>
	</tr>
	<tr>
	<th>User_name</th>
	<td><form:input path="userName"/>
	<form:errors path="userName"/></td>
	</tr>
	<tr>
	<th>File_id</th>
	<td><form:input path="fileId"/>
	<form:errors path="fileId"/></td>
	</tr>
	<tr>
	<th colspan=2><input type=submit value="입력">
	<input type=reset value="취소"></th>
	</tr>
	</table>
	</form:form>

</body>
</html>