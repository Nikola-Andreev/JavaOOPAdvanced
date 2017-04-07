package g_openClosedPrincipies.exercises.a_logger.models;

import g_openClosedPrincipies.exercises.a_logger.interfaces.Appender;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Logger;

import java.util.Collection;

public class MessageLogger implements Logger {

    private Collection<Appender> appenders;

    public MessageLogger(Collection<Appender> appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logError(String dateTime, String message) {
        this.notifyAppenders(dateTime, message);
    }

    @Override
    public void logInfo(String dateTime, String message) {
        this.notifyAppenders(dateTime, message);
    }

    @Override
    public void logCritical(String dateTime, String message) {
        this.notifyAppenders(dateTime, message);
    }

    @Override
    public void logFatal(String dateTime, String message) {
        this.notifyAppenders(dateTime, message);
    }

    @Override
    public void logWarning(String dateTime, String message) {
        this.notifyAppenders(dateTime, message);
    }

    private void notifyAppenders(String dateTime, String message) {
        for (Appender appender : this.appenders) {
            appender.append(dateTime, message);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Logger info").append(System.lineSeparator());
        for (Appender appender : this.appenders) {
            builder.append(appender).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
