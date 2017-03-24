package d_iteratorsAndComparators.lab.a_b_c_d_library;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book b) {
        if (this.title.compareTo(b.title) == 0) {
            return Integer.compare(this.year, b.year);
        }
        return this.title.compareTo(b.getTitle());
    }

    @Override
    public String toString() {
        return this.title + " " + this.getYear();
    }
}