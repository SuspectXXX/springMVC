<%--
  Created by IntelliJ IDEA.
  User: YuanKaige
  Date: 2021-11-21
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>INDEX</title>
</head>
<body>
    <a href="hello/hello">TO SUCCESS</a><br/>

    <a href="test01/100">测试@PathVariable1</a><br/>

    <a href="100/test02">测试@PathVariable2</a><br/>

    <a href="100">测试@PathVariable3</a><br/>

    <a href="book/1">查询图书</a>

    <form action="book" method="post">
        <input type="submit" value="添加图书"/>
    </form>

    <form action="book/1" method="post">
        <input name="_method" value="delete" hidden/>
        <input type="submit" value="删除图书"/>
    </form>

    <form action="book/1" method="post">
        <input name="_method" value="put" hidden/>
        <input type="submit" value="更新图书"/>
    </form>
</body>
</html>