package com.liu.news.service.impl;

import com.liu.news.bean.News;
import com.liu.news.dao.NewsDao;
import com.liu.news.dao.impl.NewsDaoImpl;
import com.liu.news.service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {

    private NewsDao newsDao = new NewsDaoImpl();

    @Override
    public List<News> findAll() {
        return newsDao.findAll();
    }

    @Override
    public News findById(Integer id) {
        return newsDao.findById(id);
    }

    @Override
    public boolean addNews(News news) {
        return newsDao.addNews(news)  > 0 ? true : false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return newsDao.deleteById(id) > 0 ? true : false;
    }

    @Override
    public boolean updateNews(News news) {
        return newsDao.updateNews(news) > 0 ? true : false;
    }

}
