package e_enumerationsAndAnotations.lab.a_weekDays;

public interface IWeeklyCalendar {

    void addEntry(String weekday, String notes);

    Iterable<WeeklyEntry> getWeeklySchedule();
}
