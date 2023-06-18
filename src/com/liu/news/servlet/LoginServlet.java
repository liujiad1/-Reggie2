package com.liu.news.servlet;

import com.liu.news.bean.Login;
import com.liu.news.dao.LoginDao;
import com.liu.news.dao.NewsDao;
import com.liu.news.dao.impl.LoginDaoImpl;
import com.liu.news.dao.impl.NewsDaoImpl;
import com.liu.news.service.LoginService;
import com.liu.news.service.impl.LoginServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        //4.调用UserDao的login方法
        Login user = loginService.findUser(username, password);

        //5.判断user
        if(user == null){
            //登录失败
            req.setAttribute("login_msg","用户名或密码错误!");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }else{
            //登录成功
            //存储数据
            req.setAttribute("user",user);
            //转发
            req.getRequestDispatcher("addNew.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
