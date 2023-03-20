package com.sub.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private List<Department> childDepartments;

    public HeadDepartment() {

        this.childDepartments = new ArrayList<>();

    }

    @Override
    public void printDepartmentName() {

        childDepartments.forEach(Department::printDepartmentName);

    }

    void addDepartment(Department department) {

        childDepartments.add(department);

    }

    void removeDepartment(Department department) {

        childDepartments.remove(department);

    }
}
