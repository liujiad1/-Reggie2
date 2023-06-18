package com.liu.news.service.impl;

import com.liu.news.bean.Login;
import com.liu.news.dao.LoginDao;
import com.liu.news.dao.impl.LoginDaoImpl;
import com.liu.news.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao = new LoginDaoImpl();
    @Override
    public Login findUser(String user, String password) {
        return loginDao.findUser(user,password);
    }
}
