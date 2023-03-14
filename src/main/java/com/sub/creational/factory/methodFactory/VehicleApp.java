package com.sub.creational.factory.methodFactory;

import java.util.Arrays;
import java.util.List;

public class VehicleApp {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        MotocycleFactory motocycleFactory = new MotocycleFactory();

        List<MotorVehicle> vehicles = Arrays.asList(carFactory.create(), motocycleFactory.create(),
                motocycleFactory.create(), carFactory.create());

        vehicles.stream().forEach(System.out::println);

    }
}
