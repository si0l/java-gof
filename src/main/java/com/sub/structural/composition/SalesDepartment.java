package com.sub.structural.composition;

public class SalesDepartment implements Department {

    @Override
    public void printDepartmentName() {

        System.out.println(getClass().getSimpleName());
    }

}
