package g_openClosedPrincipies.exercises.a_logger.io;


import g_openClosedPrincipies.exercises.a_logger.interfaces.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}
