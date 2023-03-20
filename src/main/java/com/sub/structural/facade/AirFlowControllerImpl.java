package com.sub.structural.facade;

public class AirFlowControllerImpl implements AirFlowController {

    @Override
    public String takeAir() {

        return "Take air";
    }

    @Override
    public String off() {

        return "Air flow controller is off";
    }

}
