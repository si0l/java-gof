package com.sub.behavioral.mediator;

public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {

        mediator.start();
        isOn = true;

    }

    public void turnOff() {

        isOn = false;
        mediator.stop();

    }

    public boolean isOn() {

        return isOn;
    }

}
