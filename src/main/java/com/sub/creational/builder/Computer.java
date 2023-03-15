package com.sub.creational.builder;

public class Computer {

    private String HDD;
    private String RAM;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {

        return HDD;
    }

    public String getRAM() {

        return RAM;
    }

    public boolean isGraphicCardEnabled() {

        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {

        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicCardEnabled=" + isGraphicCardEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    private Computer(ComputerBuilder computerBuilder) {

        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;

    }

    public static class ComputerBuilder {

        // mandatory
        private String HDD;
        private String RAM;

        // optional
        private boolean isBluetoothEnabled;
        private boolean isGraphicCardEnabled;

        public ComputerBuilder(String HDD, String RAM) {

            this.RAM = RAM;
            this.HDD = HDD;

        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {

            this.isBluetoothEnabled = isBluetoothEnabled;

            return this;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {

            this.isGraphicCardEnabled = isGraphicCardEnabled;

            return this;
        }

        public Computer build() {

            return new Computer(this);
        }

    }

}
