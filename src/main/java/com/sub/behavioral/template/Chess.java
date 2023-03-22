package com.sub.behavioral.template;

public class Chess extends Game {

    @Override
    void initialize() {
        System.out.println("chess game initialized");
    }

    @Override
    void start() {
        System.out.println("chess game started");
    }

    @Override
    void end() {
        System.out.println("chess game ended");
    }


}
