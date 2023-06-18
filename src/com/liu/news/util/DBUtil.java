package com.liu.news.util;

import java.sql.*;

public class DBUtil {
    //1.提供数据库连接的字符串信息
    //连接MYSQL的驱动
    private static String driver="com.mysql.jdbc.Driver";
    //JAVA通过JDBC连接MYSQL的字符串
    private String url="jdbc:mysql://localhost:3306/1908_test?useUnicode=true&characterEncoding=UTF-8";
    //MYSQL数据库的账户
    private String user="root";
    //MYSQL数据库的密码
    private String password="root";

    //2.使用静态块 将数据库驱动加载至 JVM
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //3.提供数据库连接对象
    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //4.关闭数据库相关对象
    //增删改
    public void close(Connection conn, PreparedStatement pstat){
        closeObject(pstat);
        closeObject(conn);
    }
    //查
    public void close(Connection conn, PreparedStatement pstat, ResultSet rs){
        closeObject(rs);
        closeObject(pstat);
        closeObject(conn);
    }


    private void closeObject(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) { }
        }
    }
    private void closeObject(PreparedStatement pstat){
        if(pstat != null){
            try {
                pstat.close();
            } catch (SQLException e) { }
        }
    }
    private void closeObject(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) { }
        }
    }
}
