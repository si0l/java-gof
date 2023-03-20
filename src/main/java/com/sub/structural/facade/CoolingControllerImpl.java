package com.sub.structural.facade;

public class CoolingControllerImpl implements CoolingController {

    @Override
    public String setTemperatureUpperLimit(int temperature) {

        return "Set temperature upper limit: " + temperature;
    }

    @Override
    public String run() {

        return "Run cooler controller";
    }

    @Override
    public String cool(int temperature) {

        return "Cool to: " + temperature;
    }

    @Override
    public String stop() {

        return "Stop cooling controller";
    }

}
