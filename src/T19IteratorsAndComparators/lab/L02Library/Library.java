package T19IteratorsAndComparators.lab.L02Library;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return Arrays.stream(books).iterator();
//        return new Iterator<>() {
//            private int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index < books.length;
//            }
//
//            @Override
//            public Book next() {
//                return books[index++];
//            }
//        };
    }
}
