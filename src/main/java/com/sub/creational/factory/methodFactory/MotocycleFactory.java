package com.sub.creational.factory.methodFactory;

public class MotocycleFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motocycle();
    }


}
