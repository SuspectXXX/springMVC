<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>员工修改页面</h1>
<!-- modelAttribute：这个表单的所有内容显示绑定的是请求域中 employee的值-->
<form:form action="${pageContext.request.contextPath}/emp/${employee.id }"
	modelAttribute="employee" method="post">
	<input type="hidden" name="_method" value="put"/>
	email:<form:input path="email"/><br/>
	gender:&nbsp;&nbsp;&nbsp;
		男:<form:radiobutton path="gender" value="1"/>&nbsp;&nbsp;&nbsp;
		女:<form:radiobutton path="gender" value="0"/><br/>
	dept:
		<form:select path="department.id" items="${depts }"
			itemLabel="departmentName" itemValue="id"></form:select>
			<br/>
	<input type="submit" value="修改"/>

</form:form>


<%--<form action="${pageContext.request.contextPath}/emp/${employee.id }" method="post">--%>
	<%--<input type="hidden" name="_method" value="put"/>--%>
	<%--<input type="hidden" name="id" value="${employee.id }"/>--%>
	<%--email:<input type="text" name="email" value="${employee.email}"/><br/>--%>
	<%--gender:&nbsp;&nbsp;&nbsp;--%>
    <%--男:<input type="radio" name="gender" <c:if test="${employee.gender eq 1}">checked</c:if> value="1"/>&nbsp;&nbsp;&nbsp;--%>
	<%--女:<input type="radio" name="gender" <c:if test="${employee.gender eq 0}">checked</c:if> value="0"/>&nbsp;&nbsp;&nbsp;<br/>--%>
	<%--dept:--%>
	<%--<select name="department.id">--%>
		<%--<c:forEach items="${depts}" var="deptItem">--%>
            <%--<option value="${deptItem.id }" <c:if test="${employee.department.id eq deptItem.id}">selected</c:if>>${deptItem.departmentName }</option>--%>
		<%--</c:forEach>--%>
	<%--</select>--%>
	<%--<br/>--%>
	<%--<input type="submit" value="修改"/>--%>

<%--</form>--%>
</body>
</html>