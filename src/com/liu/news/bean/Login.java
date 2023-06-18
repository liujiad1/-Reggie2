package com.liu.news.bean;

/**
 * 登录类
 */
public class Login {

    Integer id;
    /**
     * 登录名称
     */
    String username;

    /**
     * 登陆密码
     */
    String password;

    public Login(){

    }

    public Login(Integer id,String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
