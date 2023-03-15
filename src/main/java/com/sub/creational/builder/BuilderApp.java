package com.sub.creational.builder;

public class BuilderApp {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("500GB", "2GB")
                .setBluetoothEnabled(true)
                .setGraphicCardEnabled(false).build();

        System.out.println(computer);

    }
}
