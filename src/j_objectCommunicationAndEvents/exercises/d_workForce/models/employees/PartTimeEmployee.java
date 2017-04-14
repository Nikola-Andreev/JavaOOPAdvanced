package j_objectCommunicationAndEvents.exercises.d_workForce.models.employees;

import j_objectCommunicationAndEvents.exercises.d_workForce.interfaces.Employee;

public class PartTimeEmployee implements Employee {

    private static final int WORK_HOURS_PER_WEEK = 20;
    private String name;

    public PartTimeEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWorkHoursPerWeek() {
        return WORK_HOURS_PER_WEEK;
    }
}
