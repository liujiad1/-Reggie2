package com.liu.news.servlet;

import com.liu.news.bean.News;
import com.liu.news.service.NewsService;
import com.liu.news.service.impl.NewsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newsServlet")
public class newsServlet extends HttpServlet {
    private NewsService newsService =  new NewsServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        try{
            //1.获取请求参数的Map
            String sid = req.getParameter("id");
            //2.调用方法
            News news = newsService.findById(Integer.parseInt(sid));
            //3.存入请求域中
            req.setAttribute("news",news);
            //4.响应
            System.out.println(news);
            return;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        doPost(req,resp);
    }
}
