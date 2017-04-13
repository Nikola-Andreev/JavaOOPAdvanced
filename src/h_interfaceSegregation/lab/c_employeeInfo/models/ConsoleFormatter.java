package h_interfaceSegregation.lab.c_employeeInfo.models;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Formatter;

public class ConsoleFormatter implements Formatter{

    public String format(Iterable<?> employees) {
        StringBuilder sb = new StringBuilder();
        for (Object employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
