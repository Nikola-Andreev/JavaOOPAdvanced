package h_interfaceSegregation.lab.c_employeeInfo.models;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Database;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Employee;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.InfoProvider;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeInfoProvider implements InfoProvider{

    private Database database;

    public EmployeeInfoProvider(Database db) {
        this.database = db;
    }

    public List<Employee> getDataByName() {
        return this.database.readData().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    public Iterable<Employee> getDataBySalary() {
        return this.database.readData().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
    }
}
