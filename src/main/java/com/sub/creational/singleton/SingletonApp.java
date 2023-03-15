package com.sub.creational.singleton;

public class SingletonApp {

    public static void main(String[] args) {

        SingletonExample.getSingletonExample().getNames().stream().forEach(System.out::println);

    }

}
