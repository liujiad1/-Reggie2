<%--
  Created by IntelliJ IDEA.
  User: 刘家顺
  Date: 2021/12/14
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增新闻信息</title>
</head>
<body>
    <a href="addNew.jsp"> 新增新闻</a>
    <br>
    <a href="deleteNews.jsp">删除新闻</a>
    <br>
    <a href="update.jsp">编辑新闻</a>
    <center>
        <font color="black" size="16px">后台管理-新增新闻信息</font>
        <hr>
        <form action="AddServlet" method="post">
            <table border="0" cellspacing="0" cellpadding="0" width="400px">
                <tr height="10px">
                    <td width="300px">新闻信息:</td>
                    <td width="500px"><input type="text" name="information" /></td>
                </tr>
                <tr height="50px">
                    <td>作者：</td>
                    <td><input type="text" name="author" /></td>
                </tr>
                <tr height="50px">
                    <td>时间:</td>
                    <td><input type="text" name="data" /></td>
                </tr>

                <tr height="50px">
                    <td></td>
                    <td>
                        <input type="submit" value="添加" />
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="showNews.jsp">返回书籍信息</a>
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
