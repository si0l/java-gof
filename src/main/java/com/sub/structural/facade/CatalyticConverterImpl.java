package com.sub.structural.facade;

public class CatalyticConverterImpl implements CatalyticConverter {

    @Override
    public String on() {

        return "Catalytic converter is on";
    }

    @Override
    public String off() {

        return "Catalytic converter is off";
    }
    
}
