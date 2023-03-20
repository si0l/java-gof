package com.sub.structural.facade;

public interface CoolingController {

    public String setTemperatureUpperLimit(int temperature);

    public String run();

    public String cool(int temperature);

    public String stop();

}
