package com.liu.news.dao;

import com.liu.news.bean.News;

import java.util.List;

public interface NewsDao {
    /**
     * 查询所有新闻信息
     * @return
     */
    List<News> findAll();

    /**
     * 根据Id查询详情新闻信息
     */
    News findById(Integer id);

    int addNews(News news);

    /**
     * 根据Id删除
     */
    int deleteById(Integer id);

    int updateNews(News news);

}
