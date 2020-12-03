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
	<form:form action="insert" method="post" modelAttribute="emp">
	<h1>사원 정보 입력</h1>
	<table border=1>
	<tr>
	<th>Employee_id</th>
	<td><form:input path="employeeId"/>
	<form:errors path="employeeId" /></td>
	</tr>
	<tr>
	<th>First_name</th>
	<td><form:input path="firstName"/>
	<form:errors path="firstName" /></td>
	</tr>
	<tr>
	<th>Last_name</th>
	<td><form:input path="lastName"/>
	<form:errors path="lastName"/></td>
	</tr>
	<tr>
	<th>Email</th>
	<td><form:input path="email"/>
	<form:errors path="email"/></td>
	</tr>
	<tr>
	<th>Phone_number</th>
	<td><form:input path="phoneNumber"/>
	<form:errors path="phoneNumber"/></td>
	</tr>
	<tr>
	<th>Hire_date</th>
	<td><form:input path="hireDate" type="date" required="required"/>
	<form:errors path="hireDate"/></td>
	</tr>
	<tr>
	<th>Job_id</th>
	<td><form:select path="jobId">
	<c:forEach var="job" items="${jobList}">
	<option value="${job.jobId}">${job.jobTitle}</option>
	</c:forEach>
	</form:select></td>
	</tr>
	<tr>
	<th>Salary</th>
	<td><form:input path="salary"/>
	<form:errors path="salary"/></td>
	</tr>
	<tr>
	<th>Commission_pct</th>
	<td><form:input path="commissionPct" type="number" step="0.05"/>
	<form:errors path="commissionPct"/></td>
	</tr>
	<tr>
	<th>Manager_id</th>
	<td><form:select path="managerId">
	<c:forEach var="man" items="${manList }">
	<option value="${man.managerId }">${man.managerName }</option>
	</c:forEach>
	</form:select></td>
	</tr>
	<tr>
	<th>Department_id</th>
	<td><form:select path="departmentId">
	<c:forEach var="dept" items="${deptList }">
	<option value="${dept.departmentId }">${dept.departmentName }</option>
	</c:forEach>
	</form:select></td>
	</tr>
	<tr>
	<th colspan=2><input type=submit value="입력">
	<input type=reset value="취소"></th>
	</tr>
	</table>
	</form:form>

<!--  
	<form action="insert" method="post">
		<h1>사원 정보 입력</h1>
		<table border=1>
		<tr>
			<td>사원번호</td> <td><input type=text name=employeeId></td>
		</tr>
		<tr>
			<td>이름, 성</td> <td><input type=text name=firstName><input type=text name=lastName></td>
		</tr>
		<tr>
			<td>이메일</td> <td><input type=text name=email></td>
		</tr>
		<tr>
			<td>연락처</td> <td><input type=text name=phoneNumber></td>
		</tr>
		<tr>
			<td>입사일</td> <td><input type=date name=hireDate></td>
		</tr>
		<tr>
			<td>직무</td> 
			<td><select name="jobId"> 
				<c:forEach var="job" items="${jobList}">
					<option value="${job.jobId}">${job.jobTitle }</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>급여</td><td><input type=text name=salary></td>
		</tr>
		<tr>
			<td>보너스율</td><td><input type=number name=commissionPct min=0 max=0.95 step=0.05></td>
		</tr>
		<tr>
			<td>매니저</td>
			<td><select name="managerId">
				<c:forEach var="man" items="${manList }">
					<option value="${man.managerId}">${man.managerName }</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>부서</td>
			<td><select name="departmentId">
				<c:forEach var="dept" items="${deptList }">
					<option value="${dept.departmentId }">${dept.departmentName }</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td><input type=submit value=입력><input type=reset value=취소></td>
		</tr>
		</table>
	</form>
-->
</body>
</html>