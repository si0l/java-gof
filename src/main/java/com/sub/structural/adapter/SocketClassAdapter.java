package com.sub.structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {

    public Volt get120Volt() {

        return getVolt();
    }

    public Volt get12Volt(){

        return convert(getVolt(), 10);
    }

    public Volt get3Volt(){

        return convert(getVolt(), 40);
    }

    private Volt convert(Volt volt, int i) {

        return new Volt(volt.volt() / i);
    }

}
