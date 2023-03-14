package com.sub.creational.factory.abstractFactory;

public class NextGenCorporationFactory extends CorporationFactory {

    @Override
    public MotorVehicle createMotorVehicle() {

        return new NextGenMotorVehicle();

    }

    @Override
    public ElectricVehicle createElectricVehicle() {

        return new NextGenElectricVehicle();

    }

}
