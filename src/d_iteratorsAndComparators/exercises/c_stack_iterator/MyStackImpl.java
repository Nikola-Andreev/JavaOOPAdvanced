package d_iteratorsAndComparators.exercises.c_stack_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MyStackImpl implements MyStack{

    private List<Integer> elements;
    private int currentIndex;

    public MyStackImpl() {
        this.setElements();
    }

    public List<Integer> getElements() {
        return Collections.unmodifiableList(this.elements);
    }

    private void setElements() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void push(int element) {
        this.elements.add(0, element);
    }

    @Override
    public int pop() {
        return this.elements.remove(0);
    }

    @Override
    public Iterator iterator() {
        return this.elements.iterator();
    }
}