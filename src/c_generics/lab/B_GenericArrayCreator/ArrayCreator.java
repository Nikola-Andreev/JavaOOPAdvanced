package c_generics.lab.B_GenericArrayCreator;

import java.lang.reflect.Array;

class ArrayCreator {

    @SuppressWarnings("unchecked")
    static  <T> T[] create(int length, T item) {
        T[] array = (T[])new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    static  <T> T[] create(Class<T> c, int length, T item) {
        T[] array = (T[])Array.newInstance(c, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }
}
