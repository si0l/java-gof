package com.sub.behavioral.state;

public class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("Open sales db");
    }

    @Override
    public void close() {
        System.out.println("Close sales db");
    }

    @Override
    public void log() {
        System.out.println("Log sales activities");
    }

    @Override
    public void update() {
        System.out.println("Update sales");
    }
    
}
