package com.sub.behavioral.template;

public class Soccer extends Game {

    @Override
    void initialize() {
        System.out.println("soccer game initialized");
    }

    @Override
    void start() {
        System.out.println("soccer game started");
    }

    @Override
    void end() {
        System.out.println("soccer game ended");
    }


}
