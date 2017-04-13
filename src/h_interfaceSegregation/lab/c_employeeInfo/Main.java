package h_interfaceSegregation.lab.c_employeeInfo;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Database;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Formatter;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.InfoProvider;
import h_interfaceSegregation.lab.c_employeeInfo.models.ConsoleClient;
import h_interfaceSegregation.lab.c_employeeInfo.models.ConsoleFormatter;
import h_interfaceSegregation.lab.c_employeeInfo.models.EmployeeDatabase;
import h_interfaceSegregation.lab.c_employeeInfo.models.EmployeeInfoProvider;

public class Main {

    public static void main(String[] args) {
        Database db = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(db);
        Formatter formatter = new ConsoleFormatter();

        ConsoleClient client = new ConsoleClient(formatter, employeeInfo);
        client.run();
    }
}
