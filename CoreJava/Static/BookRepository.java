package CoreJava.Static;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BookRepository {
    private static Set<Book> books = new HashSet<>();

    static {
        books.add(new Book(1, "123456789", "Stories", "Green", new Date()));
        books.add(new Book(2, "987654321", "Math 101", "White", new Date()));
        books.add(new Book(3, "123459876", "Intro to Algo", "Steve", new Date()));
    }

    public static Set<Book> getBooks() {
        return books;
    }
}
