package com.sub.creational.factory.abstractFactory;

public class FutureMotorVehicle implements MotorVehicle {

    public static String NAME = "future motor vehicle";

    @Override
    public void build() {

        System.out.println("Build " + NAME);

    }

    @Override
    public String toString() {

        return NAME;

    }

}
