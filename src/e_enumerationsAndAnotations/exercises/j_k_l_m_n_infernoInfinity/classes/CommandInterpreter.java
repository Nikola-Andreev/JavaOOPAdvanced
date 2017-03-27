package e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.classes;

import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.anotations.ClassInfo;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.enums.GemType;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.enums.WeaponType;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.interfaces.CommandExecutor;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.interfaces.Weapon;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.interfaces.Writer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

public class CommandInterpreter implements CommandExecutor {

    private HashMap<String, Weapon> weapons;
    private Class<WeaponImpl> weaponClass;
    private Writer writer;

    public CommandInterpreter() {
        this.weapons = new HashMap<>();
        this.weaponClass = WeaponImpl.class;
        this.writer = new OutputWriter();
    }

    @Override
    public void executeCommand(String[] command) {
        switch (command[0]) {
            case "Create":
                weapons.put(command[2], new WeaponImpl(WeaponType.valueOf(command[1].toUpperCase()), command[2]));
                break;
            case "Add":
                weapons.get(command[1]).addGem(Integer.valueOf(command[2]), GemType.valueOf(command[3].toUpperCase()));
                break;
            case "Remove":
                weapons.get(command[1]).removeGem(Integer.valueOf(command[2]));
                break;
            case "Print":
                writer.print(weapons.get(command[1]).toString());
                break;
            case "Compare":
                Weapon weapon1 = weapons.get(command[1]);
                Weapon weapon2 = weapons.get(command[2]);
                DecimalFormat df = new DecimalFormat("0.0");
                if (weapon1.compareTo(weapon2) < 0) {
                    writer.print(weapon2 + " (Item Level: " + df.format(weapon2.getItemLevel()) + ")");
                } else {
                    writer.print(weapon1 + " (Item Level: " + df.format(weapon1.getItemLevel()) + ")");
                }
                break;
            case "Author":
                writer.print("Author: " + weaponClass.getAnnotation(ClassInfo.class).author());
                break;
            case "Revision":
                writer.print("Revision: " + weaponClass.getAnnotation(ClassInfo.class).revision());
                break;
            case "Description":
                writer.print("Class description: " + weaponClass.getAnnotation(ClassInfo.class).description());
                break;
            case "Reviewers":
                writer.print("Reviewers: " + Arrays.toString(weaponClass.getAnnotation(ClassInfo.class)
                        .reviewers()).replace("]","").replace("[",""));
                break;
            default:
                break;
        }
    }
}