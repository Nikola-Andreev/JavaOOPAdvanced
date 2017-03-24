package c_generics.еxercise.C_CustomList;

import java.util.*;

public class CustomList<E extends Comparable<E>>{

    private List<E> list;

    CustomList() {
        this.list = new ArrayList<>();
    }

    void add(E element) {
        this.list.add(element);
    }

	E remove(int index) {
        return this.list.remove(index);
    }

	boolean contains(E element) {
        return this.list.contains(element);
    }

	void swap(int index1, int index2) {
        E element1 = this.list.get(index1);
        E element2 = this.list.get(index2);
        this.list.set(index2, element1);
        this.list.set(index1, element2);
    }

	int countGreaterThat(E element) {
        int counter = 0;
        for (E e : list) {
            if (e.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

	E getMax() {
      return Collections.max(this.list);
    }

	E getMin() {
        return Collections.min(this.list);
    }

    void sort() {
        this.list.sort(Comparable::compareTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e : list) {
            sb.append(e).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}