package h_interfaceSegregation.lab.c_employeeInfo.models;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Database;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase implements Database {

    public List<Employee> readData() {
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,
                new EmployeeImpl("Pesho", 20),
                new EmployeeImpl("Gosho", 40));

        return employees;
    }
}
