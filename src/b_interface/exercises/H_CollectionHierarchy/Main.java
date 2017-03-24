package b_interface.exercises.H_CollectionHierarchy;

import b_interface.exercises.H_CollectionHierarchy.collections.AddCollection;
import b_interface.exercises.H_CollectionHierarchy.collections.AddRemoveCollection;
import b_interface.exercises.H_CollectionHierarchy.collections.MyList;
import b_interface.exercises.H_CollectionHierarchy.interfaces.IAddable;
import b_interface.exercises.H_CollectionHierarchy.interfaces.IRemovable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        IAddable collection1 = new AddCollection();
        IRemovable collection2 = new AddRemoveCollection();
        IRemovable collection3 = new MyList();
        String[] input = scan.readLine().split("\\s+");
        int number = Integer.parseInt(scan.readLine());

        addElementsToCollection(collection1, input);
        addElementsToCollection(collection2, input);
        addElementsToCollection(collection3, input);

        removeElementsFromCollection(collection2, number);
        removeElementsFromCollection(collection3, number);
    }

    private static void removeElementsFromCollection(IRemovable collection, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }

    private static void addElementsToCollection(IAddable collection, String[] input) {
        for (String s : input) {
            System.out.print(collection.add(s) + " ");
        }
        System.out.println();
    }
}