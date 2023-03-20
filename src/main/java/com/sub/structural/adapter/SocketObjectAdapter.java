package com.sub.structural.adapter;

public class SocketObjectAdapter implements SocketAdapter {

    private Socket socket = new Socket();

    public Volt get120Volt() {

        return socket.getVolt();
    }

    public Volt get12Volt(){

        return convert(socket.getVolt(), 10);
    }

    public Volt get3Volt(){

        return convert(socket.getVolt(), 40);
    }

    private Volt convert(Volt volt, int i) {

        return new Volt(volt.volt() / i);
    }

}
