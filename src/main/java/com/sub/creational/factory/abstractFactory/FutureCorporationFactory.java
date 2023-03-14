package com.sub.creational.factory.abstractFactory;

public class FutureCorporationFactory extends CorporationFactory {

    @Override
    public MotorVehicle createMotorVehicle() {

        return new FutureMotorVehicle();

    }

    @Override
    public ElectricVehicle createElectricVehicle() {

        return new FutureElectricVehicle();

    }

}
