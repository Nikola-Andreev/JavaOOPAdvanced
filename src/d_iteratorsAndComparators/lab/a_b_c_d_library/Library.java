package d_iteratorsAndComparators.lab.a_b_c_d_library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {

    private Book[] books;

    @SafeVarargs
    Library(Book... books) {
        this.books = books;
    }


    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {

        private int index;

        private LibraryIterator() {
            this.setIndex();
        }

        private void setIndex() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[this.index++];
        }
    }
}
