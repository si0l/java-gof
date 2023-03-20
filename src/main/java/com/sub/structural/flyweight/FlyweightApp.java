package com.sub.structural.flyweight;

public class FlyweightApp {

    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.createVehicle(new Blue());
        System.out.println(VehicleFactory.getSize());
        Vehicle vehicle2 = VehicleFactory.createVehicle(new Blue());
        System.out.println(VehicleFactory.getSize());
        Vehicle vehicle3 = VehicleFactory.createVehicle(new Red());
        System.out.println(VehicleFactory.getSize());

    }

}
