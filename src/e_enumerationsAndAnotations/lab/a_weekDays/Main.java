package e_enumerationsAndAnotations.lab.a_weekDays;

public class Main {
    public static void main(String[] args) {

        IWeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Monday", "SoftUni");
        wc.addEntry("Friday", "SoftUni again");
        wc.addEntry("Sunday", "SoftUni again and again");

        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry);
        }
    }
}
