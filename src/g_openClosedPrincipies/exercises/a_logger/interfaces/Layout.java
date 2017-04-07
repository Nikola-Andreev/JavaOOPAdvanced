package g_openClosedPrincipies.exercises.a_logger.interfaces;

import g_openClosedPrincipies.exercises.a_logger.enums.ReportLevel;

public interface Layout {
    String stringFormat(String dateTime , String message, ReportLevel reportLevel);
}
