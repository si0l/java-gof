package com.sub.structural.composition;

public class CompositeApp {

    public static void main(String args[]) {

        Department salesDepartment = new SalesDepartment();
        Department financialDepartment = new FinancialDepartment();
        HeadDepartment headDepartment = new HeadDepartment();

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

    }
}
