package g_openClosedPrincipies.exercises.a_logger.models;

import g_openClosedPrincipies.exercises.a_logger.interfaces.*;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Runnable;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

public class Engine implements Runnable{

    private Reader reader;
    private Writer writer;
    private Controller logController;
    private AppenderFactory appenderFactory;
    private Collection<Appender> appenders;

    public Engine(Reader reader, Writer writer, AppenderFactory appenderFactory) {
        this.reader = reader;
        this.appenderFactory = appenderFactory;
        this.appenders = new LinkedList<>();
        this.writer = writer;
    }

    @Override
    public void run() throws IOException, ReflectiveOperationException {

        int appendersCount = Integer.parseInt(this.reader.readLine());
        this.initAppenders(appendersCount);

        this.initLogger();

        while (true) {
            String[] args = this.reader.readLine().split("\\|");
            if (args[0].toLowerCase().equals("end")) {
                break;
            }
            this.logController.log(args);
        }

        String output =  this.logController.getLogs();
        this.writer.writeLine(output);
    }

    private void initAppenders(int appendersCount) throws IOException, ReflectiveOperationException {
        for (int index = 0; index < appendersCount; index++) {
            String[] params = this.reader.readLine().split("\\s+");
            Appender appender = this.appenderFactory.createAppender(params);
            this.appenders.add(appender);
        }
    }

    private void initLogger() {
        Logger logger = new MessageLogger(this.appenders);
        this.logController = new LogController(logger);
    }
}
