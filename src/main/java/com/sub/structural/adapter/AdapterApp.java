package com.sub.structural.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Object Adapter=" + v3.volt());
        System.out.println("v12 volts using Object Adapter=" + v12.volt());
        System.out.println("v120 volts using Object Adapter=" + v120.volt());
    }

    private static void testClassAdapter() {

        SocketAdapter sockAdapter = new SocketClassAdapter();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter=" + v3.volt());
        System.out.println("v12 volts using Class Adapter=" + v12.volt());
        System.out.println("v120 volts using Class Adapter=" + v120.volt());

    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {

        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            case 120:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }

    }
}
