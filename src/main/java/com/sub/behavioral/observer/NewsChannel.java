package com.sub.behavioral.observer;

public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object o) {
        this.setNews((String) o);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        System.out.println("Received news");
        this.news = news;
    }

}
