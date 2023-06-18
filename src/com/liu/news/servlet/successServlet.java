package com.liu.news.servlet;

import com.liu.news.bean.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到数据
        Login user = (Login) request.getAttribute("user");

        if(user != null){
            //设置编码
            response.setContentType("text/html;charset=utf-8");
            //输出语句
            response.getWriter().write("登录成功,"+user.getUsername()+"欢迎您！！");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
