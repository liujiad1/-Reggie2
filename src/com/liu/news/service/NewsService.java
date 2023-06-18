package com.liu.news.service;

import com.liu.news.bean.News;

import java.util.List;

public interface NewsService {
    /**
     * 查询所有
     * @return
     */
    List<News> findAll();

    News findById(Integer id);

    boolean addNews(News news);

    boolean deleteById(Integer id);

    boolean updateNews(News news);

}
