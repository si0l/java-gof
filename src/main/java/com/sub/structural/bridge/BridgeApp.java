package com.sub.structural.bridge;

public class BridgeApp {

    public static void main(String[] args) {

        Shape square = new Square(new Blue());
        System.out.println(square.draw());

    }

}
