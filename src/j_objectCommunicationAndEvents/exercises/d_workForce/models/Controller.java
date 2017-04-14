package j_objectCommunicationAndEvents.exercises.d_workForce.models;

import j_objectCommunicationAndEvents.exercises.d_workForce.interfaces.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    private List<Job> jobs = new ArrayList<>();
    private Map<String, Employee> employees = new HashMap<>();

    public void addJob(Job job){
        jobs.add(job);
    }

    public void removeJob(Job job){
        jobs.remove(job);
    }

    public void addEmployee(Employee employee){
        employees.put(employee.getName(), employee);
    }

    public void removeEmployee(String name){
        employees.remove(name);
    }

    public Employee getEmployee(String name) {
        return this.employees.get(name);
    }

    public List<Job> getJobs() {
        return this.jobs;
    }
}
