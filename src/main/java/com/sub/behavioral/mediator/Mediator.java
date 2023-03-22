package com.sub.behavioral.mediator;

public class Mediator {

    private Fan fan = new Fan(this);
    private PowerSupplier powerSupplier = new PowerSupplier();

    public void press() {

        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }

    }

    public void start() {

        powerSupplier.turnOn();

    }

    public void stop() {

        powerSupplier.turnOff();

    }

}
