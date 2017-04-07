package g_openClosedPrincipies.exercises.a_logger.interfaces;

import g_openClosedPrincipies.exercises.a_logger.enums.ReportLevel;

public interface Appender {

    void append(String dateAndTime,String message);

    void setReportLevel(ReportLevel reportLevel);

    Layout getLayout();
}
