package g_openClosedPrincipies.exercises.a_logger.interfaces;

public interface AppenderFactory {

    Appender createAppender(String[] params) throws ReflectiveOperationException;
}
