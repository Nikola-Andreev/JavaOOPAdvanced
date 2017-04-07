package h_interfaceSegregation.c_employeeInfo.interfaces;

import java.util.List;

public interface InfoProvider {

    List<?> getDataByName();

    Iterable<?> getDataBySalary();
}
