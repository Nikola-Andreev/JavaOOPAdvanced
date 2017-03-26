package e_enumerationsAndAnotations.lab.a_weekDays;

import java.util.ArrayList;
import java.util.List;

public class WeeklyCalendar implements IWeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    @Override
    public void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    @Override
    public Iterable<WeeklyEntry> getWeeklySchedule() {
        this.entries.sort(WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }
}