package com.sub.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {

        System.out.println("Internet access granted: " + employeeName);

    }

}
