package j_objectCommunicationAndEvents.exercises.d_workForce.models;

import j_objectCommunicationAndEvents.exercises.d_workForce.interfaces.Employee;

public class Job {

    private Employee employee;
    private String name;
    private int hoursOfWorkRequired;

    public Job(String name, int hoursOfWorkRequired, Employee employee) {
        this.employee = employee;
        this.name = name;
        this.hoursOfWorkRequired = hoursOfWorkRequired;
    }

    public String getName() {
        return this.name;
    }

    public boolean update() {
        this.hoursOfWorkRequired -= employee.getWorkHoursPerWeek();
        if (this.hoursOfWorkRequired <= 0) {
            System.out.println("Job " + this.name + " done!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Job: " + this.name + " Hours Remaining: " + this.hoursOfWorkRequired;
    }
}