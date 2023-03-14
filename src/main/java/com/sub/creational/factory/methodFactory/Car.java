package com.sub.creational.factory.methodFactory;

public class Car implements MotorVehicle {

    @Override
    public void build() {
        
        System.out.println("Build car");
        
    }
    
    @Override
    public String toString() {

        return "car";
    }
}
