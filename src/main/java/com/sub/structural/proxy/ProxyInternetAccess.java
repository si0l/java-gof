package com.sub.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {

        this.employeeName = employeeName;

    }

    @Override
    public void grantInternetAccess() {

        var role = getRole();
        switch (role) {
            case 1 -> {
                realInternetAccess = new RealInternetAccess(employeeName);
                realInternetAccess.grantInternetAccess();
            }
            default -> {
                System.out.println("No access granted: " + employeeName);
            }
        }

    }

    private int getRole() {

        var role = switch (employeeName) {
            case "John" -> 9;
            case "Mary" -> 1;
            default -> -1;
        };

        return role;

    }

}
