package com.sub.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    public static Vehicle createVehicle(Color color) {

        // only create new vehicle if no color found
        synchronized (vehiclesCache) {
            Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
                Engine engine = new EngineImpl();

                return new Car(engine, newColor);
            });

            return newVehicle;
        }
    }

    public static int getSize() {

        return vehiclesCache.size();
    }
}
