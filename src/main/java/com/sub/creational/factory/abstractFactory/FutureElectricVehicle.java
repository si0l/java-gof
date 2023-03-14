package com.sub.creational.factory.abstractFactory;

public class FutureElectricVehicle implements ElectricVehicle {

    public static String NAME = "future electric vehicle";

    @Override
    public void build() {

        System.out.println("Build " + NAME);

    }

    @Override
    public String toString() {

        return NAME;

    }

}
