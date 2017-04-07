package g_openClosedPrincipies.exercises.a_logger.models;

import g_openClosedPrincipies.exercises.a_logger.interfaces.Controller;
import g_openClosedPrincipies.exercises.a_logger.interfaces.Logger;

import java.lang.reflect.Method;

public class LogController implements Controller {

    private Logger logger;

    public LogController(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String[] args) throws ReflectiveOperationException {
        char firstLetterToUpper = Character.toUpperCase(args[0].charAt(0));
        String reportLevelString = firstLetterToUpper + args[0].toLowerCase().substring(1);
        String dateTime = args[1];
        String message = args[2];
        Method toInvoke = this.logger.getClass().getDeclaredMethod(
                "log" + reportLevelString,
                String.class,
                String.class);
        toInvoke.invoke(this.logger, dateTime, message);
    }

    public String getLogs() {
        return this.logger.toString();
    }
}
