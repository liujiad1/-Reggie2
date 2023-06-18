package com.liu.news.servlet;

import com.liu.news.bean.News;
import com.liu.news.service.NewsService;
import com.liu.news.service.impl.NewsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private NewsService newsService = new NewsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        int id = 0;
        String information = req.getParameter("information");
        String author = req.getParameter("author");
        String data = req.getParameter("data");

        News n = new News(id,information,author,data);
        if(newsService.addNews(n)){
            resp.sendRedirect("showNews.jsp");
        }else {
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
