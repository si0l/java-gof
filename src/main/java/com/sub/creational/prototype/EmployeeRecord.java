package com.sub.creational.prototype;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation, address;
    private double salary;

    public EmployeeRecord() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");

    }

    public EmployeeRecord(int id, String name, String designation, String address, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.salary = salary;
    }

    public void showRecord() {

        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype getClone() {

        return new EmployeeRecord(id, name, designation, address, salary);

    }

}
