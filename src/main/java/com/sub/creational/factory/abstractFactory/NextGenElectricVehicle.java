package com.sub.creational.factory.abstractFactory;

public class NextGenElectricVehicle implements ElectricVehicle {

    public static String NAME = "nextgen electric vehicle";

    @Override
    public void build() {

        System.out.println("Build " + NAME);

    }

    @Override
    public String toString() {

        return NAME;

    }

}
