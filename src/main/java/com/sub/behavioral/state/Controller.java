package com.sub.behavioral.state;

public class Controller {

    private static Accounting accounting;
    private static Sales sales;

    private static Connection connection;

    public Controller() {
        accounting = new Accounting();
        sales = new Sales();
    }

    public void setAccountingConnection() {
        connection = accounting;
    }

    public void setSalesConnection() {
        connection = sales;
    }

    public void open() {
        connection.log();
        connection.open();
    }

    public void close() {
        connection.log();
        connection.close();
    }

    public void update() {
        connection.log();
        connection.update();
    }

}
