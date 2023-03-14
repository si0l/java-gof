package com.sub.creational.factory.methodFactory;

public class Motocycle implements MotorVehicle {

    @Override
    public void build() {

        System.out.println("Build motorcycle");

    }

    @Override
    public String toString() {

        return "motocycle";
    }
}
