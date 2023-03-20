package com.sub.structural.proxy;

public class ProxyApp {

    public static void main(String[] args) {

        ProxyInternetAccess internetAccess = new ProxyInternetAccess("Mary");
        internetAccess.grantInternetAccess();

        ProxyInternetAccess internetAccess2 = new ProxyInternetAccess("Dod");
        internetAccess2.grantInternetAccess();
    }

}
