package h_interfaceSegregation.lab.a_systemResources;

public class ConsolePrinter implements Writer {

    @Override
    public void println(String line) {
        System.out.println(line);
    }
}
