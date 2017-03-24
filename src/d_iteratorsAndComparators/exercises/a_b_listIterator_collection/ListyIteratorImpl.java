package d_iteratorsAndComparators.exercises.a_b_listIterator_collection;

import d_iteratorsAndComparators.exercises.a_b_listIterator_collection.interfaces.ListyIterator;

import java.util.*;
import java.util.function.Consumer;

public class ListyIteratorImpl implements ListyIterator, Iterable {
    private final int DEFAULT_INDEX_VALUE = 0;

    private List<String> elements;
    private int currentIndex;
    private Iterator<String> currentIterator;

    public ListyIteratorImpl(String... elements) {
        this.setElements(elements);
        this.setCurrentIndex(DEFAULT_INDEX_VALUE);
    }

    private List<String> getElements() {
        return Collections.unmodifiableList(this.elements);
    }

    private void setElements(String... elements) {
        this.elements = Arrays.asList(elements);
    }

    private int getCurrentIndex() {
        return this.currentIndex;
    }

    private void setCurrentIndex(int index) {
        this.currentIndex = index;
    }

    @Override
    public boolean move() {
        if (this.getCurrentIndex() + 1 < this.getElements().size()) {
            this.setCurrentIndex(this.getCurrentIndex() + 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.getCurrentIndex() + 1 < this.getElements().size();
    }

    @Override
    public String print() {
        if (this.getElements().isEmpty()) {
            return "Invalid Operation!";
        }
        return this.getElements().get(this.getCurrentIndex());
    }

    @Override
    public String printAll() {
        if (this.getElements().isEmpty()) {
            return "Invalid Operation!";
        }
        StringBuilder result = new StringBuilder();
        for (String element : this.elements) {
            result.append(element).append(" ");
        }
        return result.toString().trim();
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer action) {
        this.currentIterator = new MyIterator();
        action.accept(this.currentIterator.next());
    }

    private final class MyIterator implements Iterator<String> {

        private int index;

        @Override
        public boolean hasNext() {
            return this.index < elements.size();
        }

        @Override
        public String next() {
            return elements.get(this.index++);
        }
    }
}