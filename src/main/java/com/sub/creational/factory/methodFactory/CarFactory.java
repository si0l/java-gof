package com.sub.creational.factory.methodFactory;

public class CarFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }

}
