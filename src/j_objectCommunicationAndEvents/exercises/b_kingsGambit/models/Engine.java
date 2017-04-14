package j_objectCommunicationAndEvents.exercises.b_kingsGambit.models;

import j_objectCommunicationAndEvents.exercises.b_kingsGambit.interfaces.Attacked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Engine {

    public static void run() throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        King king = King.getInstance();
        king.setName(scan.readLine());
        Map<String, Attacked> kingdomUnits = new LinkedHashMap<>();
        kingdomUnits.put(king.getName(), king);

        String[] royalGuardsNames = scan.readLine().split("\\s+");
        for (String royalGuardName : royalGuardsNames) {
            Attacked royalGuard = new RoyalGuard(royalGuardName);
            kingdomUnits.put(royalGuardName, royalGuard);
        }

        String[] footmanNames = scan.readLine().split("\\s+");
        for (String footmanName : footmanNames) {
            Attacked footman = new Footman(footmanName);
            kingdomUnits.put(footmanName, footman);
        }

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equalsIgnoreCase("kill")) {
                if (kingdomUnits.get(input[1]).tryToKill()) {
                    kingdomUnits.remove(input[1]);
                }
            } else if (input[0].equalsIgnoreCase("attack")) {
                for (Attacked subject : kingdomUnits.values()) {
                    System.out.println(subject.respondToAttack());
                }
            } else {
                break;
            }
        }
    }
}