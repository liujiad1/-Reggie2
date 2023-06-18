package com.liu.news.dao.impl;

import com.liu.news.bean.Login;
import com.liu.news.bean.News;
import com.liu.news.dao.NewsDao;
import com.liu.news.util.DBUtil;
import com.liu.news.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 新闻实现类
 */
public class NewsDaoImpl implements NewsDao {

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<News> findAll() {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<News> newsList = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("select * from news");
            //3.执行sql语句，获取结果集
            rs = pstm.executeQuery();
            //4.遍历结果集
            newsList = new ArrayList<News>();
            while (rs.next()) {
                //5.封装
                News n = new News();
                n.setId(rs.getInt("id"));
                n.setInformation(rs.getString("information"));
                n.setAuthor(rs.getString("author"));
                n.setData(rs.getString("data"));
                //加入到集合中
                newsList.add(n);
            }
            //6.返回
            return newsList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(conn, pstm, rs);
        }
    }

    @Override
    public News findById(Integer id) {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        News n = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("select * from news where id = ? ");
            pstm.setInt(1, id);
            //3.执行sql语句，获取结果集
            rs = pstm.executeQuery();
            //4.遍历结果集
            if (rs.next()) {
                //5.封装
                n = new News();
                n.setId(rs.getInt("id"));
                n.setInformation(rs.getString("information"));
                n.setAuthor(rs.getString("author"));
                n.setData(rs.getString("data"));
            }
            //6.返回
            return n;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(conn, pstm, rs);
        }
    }

    @Override
    public int addNews(News news) {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        int result = 0;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("insert into news(id,information,author,data)values(null,?,?,?)");
            //3.设置参数
            //pstm.setInt(1,null);
            pstm.setString(1,news.getInformation());
            pstm.setString(2,news.getAuthor());
            pstm.setString(3,news.getData());
            //4.执行sql语句
            result = pstm.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(conn,pstm);
        }
        return result;
    }

    @Override
    public int deleteById(Integer id) {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        int result = 0;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("delete from news where id= ? ");
            //3.设置参数
            pstm.setInt(1,id);
            //4.执行sql语句
            result = pstm.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(conn,pstm);
        }
        return result;
    }

    @Override
    public int updateNews(News news) {
        //定义必要信息
        Connection conn = null;
        PreparedStatement pstm = null;
        int result = 0;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.获取操作对象
            pstm = conn.prepareStatement("update news set information= ?,author=?,data=? where id=? ");
            //3.设置参数
            pstm.setString(1,news.getInformation());
            pstm.setString(2,news.getAuthor());
            pstm.setString(3,news.getData());
            pstm.setInt(4,news.getId());
            //4.执行sql语句
            result = pstm.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(conn,pstm);
        }
        return result;
    }


}
