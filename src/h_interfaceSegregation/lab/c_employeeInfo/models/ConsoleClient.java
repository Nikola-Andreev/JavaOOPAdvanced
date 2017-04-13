package h_interfaceSegregation.lab.c_employeeInfo.models;

import h_interfaceSegregation.lab.c_employeeInfo.interfaces.Formatter;
import h_interfaceSegregation.lab.c_employeeInfo.interfaces.InfoProvider;

public class ConsoleClient {

    private Formatter formatter;
    private InfoProvider infoProvider;

    public ConsoleClient(Formatter formatter, InfoProvider infoProvider) {
        this.formatter = formatter;
        this.infoProvider = infoProvider;
    }

    public void run() {
        String output = formatter.format(infoProvider.getDataByName());
        System.out.println(output);
    }
}
