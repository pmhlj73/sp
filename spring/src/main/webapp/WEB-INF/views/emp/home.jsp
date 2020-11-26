<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Emp 메인화면</h2>
	환영합니다!<br>
	1. 사원의 수 <br>
	<form action="/myapp/emp/count">
		부서번호 : <input type="text" name="deptId"> <input type="submit" value="검색">
	</form>
	2. <a href="list">사원목록</a><br>
	3. 사원검색 <br>
	<form action="search">
		이름 : <input type=text name=name><input type=submit value=검색>
	</form>
	4. 부서별 사원 목록 <br>
	<form action="deptList">
		부서번호 : <input type="text" name="deptId"> <input type="submit" value="검색">
	</form>
	5. <a href="maxSalary">부서별 최고급여자</a><br>
	6. <a href="insert">사원정보 입력</a><br>

</body>
</html>