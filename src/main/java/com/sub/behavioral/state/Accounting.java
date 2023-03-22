package com.sub.behavioral.state;

public class Accounting implements Connection {

    @Override
    public void open() {
        System.out.println("Open account db");
    }

    @Override
    public void close() {
        System.out.println("Close account db");
    }

    @Override
    public void log() {
        System.out.println("Log account activities");
    }

    @Override
    public void update() {
        System.out.println("Update account");
    }
    
}
