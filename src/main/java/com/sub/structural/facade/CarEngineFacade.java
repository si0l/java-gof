package com.sub.structural.facade;

import java.util.Objects;

public class CarEngineFacade {

    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;

    private FuelInjector fuelInjector;
    private AirFlowController airFlowController;
    private Starter starter;
    private CoolingController coolingController;
    private CatalyticConverter catalyticConverter;

    private CarEngineFacade(CarEngineFacadeBuilder builder) {

        fuelInjector = builder.fuelInjector;
        airFlowController = builder.airFlowController;
        starter = builder.starter;
        coolingController = builder.coolingController;
        catalyticConverter = builder.catalyticConverter;

    }

    public void startEngine() {

        StringBuilder sb = new StringBuilder();
        sb.append(fuelInjector.on());
        if (Objects.nonNull(airFlowController)) {
            sb.append("; ").append(airFlowController.takeAir());
        }
        sb.append("; ").append(fuelInjector.inject());
        sb.append("; ").append(starter.start());
        sb.append("; ").append(coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP));
        sb.append("; ").append(coolingController.run());
        sb.append("; ").append(catalyticConverter.on());

        System.out.println(sb.toString());

    }

    public void stopEngine() {

        StringBuilder sb = new StringBuilder();

        sb.append(fuelInjector.off());
        sb.append("; ").append(catalyticConverter.off());
        sb.append("; ").append(coolingController.cool(MAX_ALLOWED_TEMP));
        sb.append("; ").append(coolingController.stop());
        if (Objects.nonNull(airFlowController)) {
            sb.append("; ").append(airFlowController.off());
        }

        System.out.println(sb.toString());

    }

    public static class CarEngineFacadeBuilder {

        private FuelInjector fuelInjector;
        private AirFlowController airFlowController;
        private Starter starter;
        private CoolingController coolingController;
        private CatalyticConverter catalyticConverter;

        public CarEngineFacadeBuilder(FuelInjector fuelInjector, Starter starter,
                CoolingController coolingController, CatalyticConverter catalyticConverter) {

            this.fuelInjector = fuelInjector;
            this.starter = starter;
            this.coolingController = coolingController;
            this.catalyticConverter = catalyticConverter;

        }

        public CarEngineFacadeBuilder setAirFlowController(AirFlowController airFlowController) {

            this.airFlowController = airFlowController;

            return this;
        }

        public CarEngineFacade build() {

            return new CarEngineFacade(this);
        }

    }

}