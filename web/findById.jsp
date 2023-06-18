<%@ page import="com.liu.news.dao.impl.NewsDaoImpl" %>
<%@ page import="com.liu.news.service.impl.NewsServiceImpl" %>
<%@ page import="com.liu.news.bean.News" %>
<%@ page import="com.liu.news.service.NewsService" %><%--
  Created by IntelliJ IDEA.
  User: 刘家顺
  Date: 2021/12/14
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>新闻详情页面</title>
</head>
<body>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        NewsService newsService = new NewsServiceImpl();
        News new2 = newsService.findById(id);
        request.setAttribute("news",new2);
    %>
    <a href="login.jsp">进入后台管理</a>
    <center>
       <h1>${news.information}</h1>
        <h>${news.author}</h>
        <h>${news.data}</h>
        <br>
        <h>内容.....</h>
        <hr>
        <a href="showNews.jsp">返回新闻列表</a>
    </center>
</body>
</html>
