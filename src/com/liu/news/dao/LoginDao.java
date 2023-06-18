package com.liu.news.dao;

import com.liu.news.bean.Login;

public interface LoginDao {
    Login findUser(String username, String password);
}
