package com.sub.behavioral.observer;

public class ObserverApp {

    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("fake news");

    }

}
