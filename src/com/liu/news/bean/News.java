package com.liu.news.bean;

/**
 * 新闻信息类
 */
public class News {
    Integer id;
    /**
     * 主题信息
     */
    String information;

    /**
     * 作者
     */
    String author;

    /**
     * 发布时间
     */
    String data;

    public News(){

    }

    public News(Integer id,String information, String author, String data) {
        this.id = id;
        this.information = information;
        this.author = author;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", information='" + information + '\'' +
                ", author='" + author + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
