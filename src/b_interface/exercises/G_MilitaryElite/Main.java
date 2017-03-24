package b_interface.exercises.G_MilitaryElite;

import b_interface.exercises.G_MilitaryElite.interfaces.*;
import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Mission;
import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Repair;
import b_interface.exercises.G_MilitaryElite.soldiers.Spy;
import b_interface.exercises.G_MilitaryElite.soldiers.privates.LeutenantGeneral;
import b_interface.exercises.G_MilitaryElite.soldiers.privates.Private;
import b_interface.exercises.G_MilitaryElite.soldiers.privates.specializedSoldier.Commando;
import b_interface.exercises.G_MilitaryElite.soldiers.privates.specializedSoldier.Engineer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<Integer, ISoldier> soldiers = new LinkedHashMap<>();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equals("End")) break;

            switch (input[0]) {
                case "Private":
                    ISoldier privateSoldier = new Private(Integer.valueOf(input[1]), input[2], input[3], Double.valueOf(input[4]));
                    soldiers.put(privateSoldier.getId(), privateSoldier);
                    break;
                case "LeutenantGeneral":
                    ILeutenanatGeneral leutenanatGeneral =
                            new LeutenantGeneral(Integer.valueOf(input[1]), input[2], input[3], Double.valueOf(input[4]));
                    for (int i = 5; i < input.length; i++) {
                        leutenanatGeneral.addPrivate((Private) soldiers.get(Integer.valueOf(input[i])));
                    }
                    soldiers.put(leutenanatGeneral.getId(), leutenanatGeneral);
                    break;
                case "Engineer":
                    try {
                        IEngineer engineer = new Engineer(Integer.valueOf(input[1]), input[2], input[3],
                                Double.valueOf(input[4]), input[5]);
                        for (int i = 6; i < input.length; i+=2) {
                            engineer.addRepair(new Repair(input[i], Integer.valueOf(input[i + 1])));
                        }
                        soldiers.put(engineer.getId(), engineer);
                    } catch (IllegalArgumentException e) {}
                    break;
                case "Commando":
                    try {
                        ICommando commando = new Commando(Integer.valueOf(input[1]), input[2], input[3],
                                Double.valueOf(input[4]), input[5]);
                        for (int i = 6; i < input.length; i += 2) {
                            try {
                                commando.addMission(new Mission(input[i], input[i + 1]));
                            } catch (IllegalArgumentException e) {}
                        }
                        soldiers.put(commando.getId(), commando);
                    } catch (IllegalArgumentException e) {}
                    break;
                case "Spy":
                    ISpy spy = new Spy(Integer.valueOf(input[1]), input[2], input[3], Integer.valueOf(input[4]));
                    soldiers.put(spy.getId(), spy);
                    break;
                default:
                    break;
            }
        }

        for (ISoldier iSoldier : soldiers.values()) {
            System.out.println(iSoldier.toString().trim());
        }
    }
}