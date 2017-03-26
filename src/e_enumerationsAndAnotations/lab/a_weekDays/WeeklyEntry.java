package e_enumerationsAndAnotations.lab.a_weekDays;

import java.util.Comparator;

public class WeeklyEntry {
    public static final Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByDay();

    private Weekday weekDay;
    private String notes;

    public WeeklyEntry(String weekDay, String notes) {
        this.weekDay = Weekday.valueOf(weekDay.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return this.weekDay.toString() + " - " + this.notes;
    }

    private static Comparator<WeeklyEntry> getComparatorByDay() {
        return Comparator.comparing(w -> w.weekDay);
    }
}