<%@ page import="com.liu.news.service.NewsService" %>
<%@ page import="com.liu.news.service.impl.NewsServiceImpl" %>
<%@ page import="com.liu.news.bean.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 刘家顺
  Date: 2021/12/14
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>新闻详情</title>
</head>
<style type="text/css">
    table{
        width: 100%;
        border-collapse: collapse;
    }

    table caption{
        font-size: 2em;
        font-weight: bold;
        margin: 1em 0;
    }

    th,td{
        border: 1px solid #999;
        text-align: center;
        padding: 20px 0;
    }

    table thead tr{
        background-color: #008c8c;
        color: #fff;
    }

    table tbody tr:nth-child(odd){
        background-color: #eee;
    }

    table tbody tr:hover{
        background-color: #ccc;
    }

    table tbody tr td:first-child{
        color: #f40;
    }

    table tfoot tr td{
        text-align: right;
        padding-right: 20px;
    }

</style>
<body>
    <%
        NewsService newsService = new NewsServiceImpl();
        List<News> news = newsService.findAll();
        request.setAttribute("newsList",news);
    %>
<%--<center>--%>
<%--    <font color="black" size="16px">新闻概要</font>--%>
<%--    <hr>--%>

<%--    <table border="0" cellspacing="0" cellpadding="0" width="800px">--%>
<%--        <c:forEach var="news" items="${newsList}">--%>
<%--            <tr>--%>
<%--                <td>${news.id}</td>--%>
<%--                <td>--%>
<%--                    <a href="findById.jsp?id=${news.id}">${news.information}</a>--%>
<%--                </td>--%>
<%--                <td>${news.author }</td>--%>
<%--                <td>${news.data }</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</center>--%>


    <table>
        <caption>新闻概要</caption>
        <!-- 表头 -->
        <thead>
        <tr>
            <td>新闻详情</td>
            <td>作者</td>
            <td>出版时间</td>
        </tr>
        </thead>
        <!-- 主体 -->
        <tbody>
    <c:forEach var="news" items="${newsList}">
        <tr>
            <td>
                <a href="findById.jsp?id=${news.id}">${news.information}</a>
            </td>
            <td>${news.author }</td>
            <td>${news.data }</td>

        </tr>
    </c:forEach>
        </tbody>
    </table>
</body>
</html>
