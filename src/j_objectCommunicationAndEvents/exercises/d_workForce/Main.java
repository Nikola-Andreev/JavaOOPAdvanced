package j_objectCommunicationAndEvents.exercises.d_workForce;

import j_objectCommunicationAndEvents.exercises.d_workForce.models.employees.PartTimeEmployee;
import j_objectCommunicationAndEvents.exercises.d_workForce.models.employees.StandartEmployee;
import j_objectCommunicationAndEvents.exercises.d_workForce.models.Controller;
import j_objectCommunicationAndEvents.exercises.d_workForce.models.Job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Controller controller = new Controller();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equalsIgnoreCase("job")) {
                controller.addJob(new Job(input[1], Integer.valueOf(input[2]), controller.getEmployee(input[3])));
            } else if (input[0].equalsIgnoreCase("standartemployee")) {
                controller.addEmployee(new StandartEmployee(input[1]));
            } else if (input[0].equalsIgnoreCase("parttimeemployee")) {
                controller.addEmployee(new PartTimeEmployee(input[1]));
            } else if (input[0].equalsIgnoreCase("pass")) {
                List<Job> jobsForRemove = new ArrayList<>();
                for (Job job : controller.getJobs()) {
                    if (job.update()) {
                        jobsForRemove.add(job);
                    }
                }
                for (Job job : jobsForRemove) {
                    controller.removeJob(job);
                }
            } else if (input[0].equalsIgnoreCase("status")) {
                for (Job job : controller.getJobs()) {
                    System.out.println(job);
                }
            } else {
                break;
            }
        }
    }
}