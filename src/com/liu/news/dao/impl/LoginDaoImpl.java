package com.liu.news.dao.impl;

import com.liu.news.bean.Login;
import com.liu.news.dao.LoginDao;
import com.liu.news.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl implements LoginDao {

    @Override
    public Login findUser(String username, String password) {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Login login = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("select * from login where username = ? and password = ?");
            pstm.setString(1, username);
            pstm.setString(2, password);
            //3.执行sql语句，获取结果集
            rs = pstm.executeQuery();
            //4.遍历结果集
            if (rs.next()) {
                //5.封装
                login = new Login();
                login.setId(rs.getInt("id"));
                login.setUsername(rs.getString("username"));
                login.setPassword(rs.getString("password"));
            }
            //6.返回
            System.out.println(login);
            return login;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(conn, pstm, rs);
        }
    }
}
