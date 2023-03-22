package com.sub.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel newChannel) {
        channels.add(newChannel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void setNews(String news){

        this.news = news;
        channels.stream().forEach(channel -> channel.update(this.news));
    }

}
