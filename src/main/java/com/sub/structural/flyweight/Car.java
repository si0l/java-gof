package com.sub.structural.flyweight;

public class Car implements Vehicle {
    
    private Engine engine;
    private Color color;

    

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {

        engine.start();
        System.out.println("Car started");
    }

    @Override
    public void stop() {

        engine.stop();
        System.out.println("Car stopped");
    }

    @Override
    public Color getColor() {

        return color;
    }

}
