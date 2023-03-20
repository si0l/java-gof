package com.sub.structural.bridge;

public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();

}
