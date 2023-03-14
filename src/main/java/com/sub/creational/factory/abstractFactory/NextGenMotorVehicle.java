package com.sub.creational.factory.abstractFactory;

public class NextGenMotorVehicle implements MotorVehicle {

    public static String NAME = "nextgen motor vehicle";

    @Override
    public void build() {

        System.out.println("Build " + NAME);

    }

    @Override
    public String toString() {

        return NAME;

    }
}
