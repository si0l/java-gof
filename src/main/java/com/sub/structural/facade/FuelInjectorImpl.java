package com.sub.structural.facade;

public class FuelInjectorImpl implements FuelInjector {

    @Override
    public String on() {

        return "Fuel injector is on";
    }

    @Override
    public String inject() {

        return "Inject fuel";
    }

    @Override
    public String off() {

        return "Fuel injetor is off";
    }


    
}
