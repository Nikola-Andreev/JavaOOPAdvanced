package c_generics.lab.A_Jar;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> {

    private Deque<E> contents;

    Jar() {
        this.contents = new ArrayDeque<>();
    }

    public void add (E element) {
        contents.push(element);
    }

    E remove() {
       return this.contents.pop();
    }
}
