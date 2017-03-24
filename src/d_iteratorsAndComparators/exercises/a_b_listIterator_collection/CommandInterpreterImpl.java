package d_iteratorsAndComparators.exercises.a_b_listIterator_collection;

import d_iteratorsAndComparators.exercises.a_b_listIterator_collection.interfaces.CommandInterpreter;
import d_iteratorsAndComparators.exercises.a_b_listIterator_collection.interfaces.ListyIterator;

public class CommandInterpreterImpl implements CommandInterpreter {

    private static ListyIterator iterator;

    public CommandInterpreterImpl() {}

    public void interpretCommand (String[] input) {
        switch (input[0]) {
            case "Create":
                iterator = new ListyIteratorImpl(takeElements(input));
                break;
            case "Move":
                System.out.println(iterator.move());
                break;
            case "Print":
                System.out.println(iterator.print());
                break;
            case "HasNext":
                System.out.println(iterator.hasNext());
                break;
            case "PrintAll":
                System.out.println(iterator.printAll());
                break;
            default:
                break;
        }
    }

    private static String[] takeElements(String[] input) {
        String[] result = new String[input.length - 1];
        System.arraycopy(input, 1, result, 0, input.length - 1);
        return result;
    }
}