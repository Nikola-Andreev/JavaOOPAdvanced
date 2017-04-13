package h_interfaceSegregation.lab.c_employeeInfo.interfaces;

import java.util.List;

public interface InfoProvider {

    List<?> getDataByName();

    Iterable<?> getDataBySalary();
}
