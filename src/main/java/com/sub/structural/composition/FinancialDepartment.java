package com.sub.structural.composition;

public class FinancialDepartment implements Department {

    @Override
    public void printDepartmentName() {

        System.out.println(getClass().getSimpleName());
    }

}
