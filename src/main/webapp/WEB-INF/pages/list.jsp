<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>员工列表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
	<h1>员工列表</h1>
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>lastName</th>
			<th>email</th>
			<th>birth</th>
			<th>salary</th>
			<th>gender</th>
			<th>departmentName</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName}</td>
				<td>${emp.email }</td>
				<td>${emp.birth }</td>
				<td>${emp.salary }</td>
				<td>${emp.gender==0?"女":"男" }</td>
				<td>${emp.department.departmentName }</td>
				<td><a href="${pageContext.request.contextPath}/emp/${emp.id }">edit</a></td>
				<td><a href="${pageContext.request.contextPath}/emp/${emp.id }" class="delBtn">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/toaddpage">添加员工</a>
	<form action="${pageContext.request.contextPath}/quickAdd" method="post">
		<input name="empInfo" value="empAdmin-admin@163.com-1-101"/>
		<input type="submit" value="快速添加"/>
	</form>
    <a href="${pageContext.request.contextPath}/json1" id="json1">AJAX1</a>
    <a href="${pageContext.request.contextPath}/json2" id="json2">AJAX2</a>
    <a href="${pageContext.request.contextPath}/json3" id="json3">AJAX3</a>

	<form id="deleteForm" method="post">
		<input type="hidden" name="_method" value="delete" />
	</form>
	<script type="text/javascript">
		$(function(){
			$(".delBtn").click(function(){
				//0、确认删除？
				if(confirm("你要离开我吗？")) {
                    //1、改变表单的action指向
                    $("#deleteForm").attr("action", this.href);
                    //2、提交表单
                    $("#deleteForm").submit();
                }
				return false;
			});

			$("#json1").click(function () {
                $.ajax({
                    url:"${pageContext.request.contextPath}/json1",
                    type:"GET",
                    success:function (data) {
                        console.log(data);
                        //console.log(data[0].id);
                    }
                });
                return false;
            });

            $("#json2").click(function () {
                $.ajax({
                    url:"${pageContext.request.contextPath}/json2",
                    type:"GET",
                    success:function (data) {
                        console.log(data);
                        var response = JSON.parse(data);
                        console.log(response);
                        console.log(response[0].id);
                    }
                });
                return false;
            });

            $("#json3").click(function () {
                var test = {name:"张三",age:18};
                var testStr = JSON.stringify(test);
                $.ajax({
                    url:"${pageContext.request.contextPath}/json3",
                    type:"POST",
                    contentType:"application/json",
                    data:testStr,
                    success:function (data) {
                        console.log(data);
                    }
                });
                return false;
            });
		});
	</script>
</body>
</html>