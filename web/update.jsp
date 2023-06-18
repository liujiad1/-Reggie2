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
    NewsService newsService = new NewsServiceImpl();
    List<News> news = newsService.findAll();
    request.setAttribute("newsList",news);
%>
<center>
    <font color="black" size="16px">新闻概要</font>
    <hr>

    <table border="0" cellspacing="0" cellpadding="0" width="800px">
        <c:forEach var="news" items="${newsList}">
            <tr>
                <td>
                        ${news.information}
                </td>
                <td>${news.author }</td>
                <td>${news.data }</td>
                <td><a href="update2.jsp?id=${news.id}">编辑</a></td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>