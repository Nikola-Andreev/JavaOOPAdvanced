package d_iteratorsAndComparators.exercises.h_pet_clinics;

import d_iteratorsAndComparators.exercises.h_pet_clinics.interfaces.Clinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCommands = Integer.parseInt(scan.readLine());
        HashMap<String, Pet> pets = new HashMap<>();
        HashMap<String, Clinic> clinics = new HashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scan.readLine().split("\\s+");

            switch (input[0]) {
                case "Create":
                    if (input[1].equals("Pet")){
                        Pet p = new Pet(input[2], Integer.valueOf(input[3]), input[4]);
                        pets.put(input[2], p);
                    } else {
                        try {
                            Clinic c = new ClinicImpl(input[2], Integer.valueOf(input[3]));
                            clinics.put(input[2], c);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Add":
                    System.out.println(clinics.get(input[2]).addPet(pets.get(input[1])));
                    break;
                case "Release":
                    System.out.println(clinics.get(input[1]).release());
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinics.get(input[1]).hasEmptyRooms());
                    break;
                case "Print":
                    if (input.length == 3) {
                        System.out.println(clinics.get(input[1]).print(Integer.valueOf(input[2])));
                    } else {
                        System.out.println(clinics.get(input[1]).print());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}