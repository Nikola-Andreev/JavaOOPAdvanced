package g_openClosedPrincipies.exercises.a_logger;

import g_openClosedPrincipies.exercises.a_logger.factories.AppenderFactoryImpl;
import g_openClosedPrincipies.exercises.a_logger.interfaces.AppenderFactory;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Reader;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Writer;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Runnable;
import g_openClosedPrincipies.exercises.a_logger.io.ConsoleReader;
import g_openClosedPrincipies.exercises.a_logger.io.ConsoleWriter;
import g_openClosedPrincipies.exercises.a_logger.models.Engine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ReflectiveOperationException {

        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        AppenderFactory appenderFactory = new AppenderFactoryImpl();
        Runnable engine =  new Engine(reader,writer,appenderFactory);
        engine.run();
    }
}
