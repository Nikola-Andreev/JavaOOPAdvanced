package h_interfaceSegregation.lab.c_employeeInfo.models;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Employee;

public class EmployeeImpl implements Employee{

    private String name;
    private int salary;

    EmployeeImpl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.getSalary();
    }
}
