package com.liu.news.service;

import com.liu.news.bean.Login;

public interface LoginService {
    Login findUser(String user,String password);
}
