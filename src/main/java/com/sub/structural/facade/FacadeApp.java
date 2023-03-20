package com.sub.structural.facade;

public class FacadeApp {

    public static void main(String[] args) {

        CarEngineFacade carEngineFacade = new CarEngineFacade.CarEngineFacadeBuilder(
                new FuelInjectorImpl(),
                new StarterImpl(),
                new CoolingControllerImpl(),
                new CatalyticConverterImpl())
                .setAirFlowController(new AirFlowControllerImpl())
                .build();

        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();

    }

}