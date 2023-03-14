package com.sub.creational.factory.abstractFactory;

import java.util.Arrays;
import java.util.List;

public class VehicleApp {

    public static void main(String[] args) {

        FutureCorporationFactory futureCorporationFactory = new FutureCorporationFactory();
        NextGenCorporationFactory nextGenCorporationFactory = new NextGenCorporationFactory();

        List<Object> vehicles = Arrays.asList(
            futureCorporationFactory.createElectricVehicle(), 
            nextGenCorporationFactory.createMotorVehicle(),
            nextGenCorporationFactory.createElectricVehicle(), 
            futureCorporationFactory.createMotorVehicle());

        vehicles.stream().forEach(System.out::println);

    }
}
