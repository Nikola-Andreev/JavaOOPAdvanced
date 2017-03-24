package d_iteratorsAndComparators.exercises.i_linked_list_traversial;

import java.util.Iterator;

public class MyLinkedListImpl<T> implements MyLinkedList<T>, Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int numberOfElements;

    public MyLinkedListImpl() {
        this.numberOfElements = 0;
        this.head = null;
        this.tail = null;
    }


    @Override
    public void add(T element) {
        Node<T> node = new Node<T>(null, this.tail, element);

        if (this.numberOfElements == 0) {
            this.tail = node;
            this.head = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        this.numberOfElements++;
    }

    @Override
    public boolean remove(T element) {

        Node<T> node = this.head;

        while (node != null) {

            if (element == node.getValue()) {

                if (node == this.head) {
                    this.head = node.getNext();
                }

                if ((node == this.tail)) {
                    this.tail = node.getPrevious();
                    this.tail.setNext(null);
                }

                if (node.getPrevious() != null) {
                    node.getPrevious().setNext(node.getNext());
                }
                if (node.getNext() != null) {
                    node.getNext().setPrevious(node.getPrevious());
                }
                this.numberOfElements--;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public int getSize() {
        return this.numberOfElements;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return this.currentNode != null;
            }

            @Override
            public T next() {
                T element = this.currentNode.getValue();
                this.currentNode = this.currentNode.getNext();

                return element;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (T t : this) {
            result.append(t).append(" ");
        }

        return result.toString().trim();
    }
}