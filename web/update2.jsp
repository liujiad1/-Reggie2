<%@ page import="com.liu.news.service.impl.NewsServiceImpl" %>
<%@ page import="com.liu.news.bean.News" %>
<%@ page import="com.liu.news.service.NewsService" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>新增新闻信息</title>
</head>
<body>
<%
     int id = Integer.parseInt(request.getParameter("id"));
    NewsService newsService = new NewsServiceImpl();
    News n = newsService.findById(id);
    request.setAttribute("news",n);

%>
<center>
    <font color="black" size="16px">编辑新闻详情页面</font>
    <hr>
    <form action="updateServlet" method="post">
        <table border="1" cellspacing="0" cellpadding="0" width="800px">
            <tr height="50px">
                <td width="300px">编号：</td>
                <td width="500px">
                    <input type="text" name="id" readonly="readonly" value="${news.id }" />
                </td>
            </tr>
            <tr height="50px">
                <td width="300px">信息</td>
                <td width="500px"><input type="text" name="information" value="${news.information }" /></td>
            </tr>
            <tr height="50px">
                <td>作者：</td>
                <td><input type="text" name="author" value="${news.author }" /></td>
            </tr>
            <tr height="50px">
                <td>价格：</td>
                <td><input type="text" name="data" value="${news.data }" /></td>
            </tr>
            <tr height="50px">
                <td></td>
                <td>
                    <input type="submit" value="提交" />
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="showNews.jsp">返回显示页面</a>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>