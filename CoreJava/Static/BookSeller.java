package CoreJava.Static;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BookSeller {

    public static void main(String[] args) {
        Set<Book> soldBooks = sellBooks();
        for (Book book : soldBooks) {
            System.out.println(book);
        }
    }

    public static Set<Book> sellBooks() {
        Set<Book> books = new HashSet<>();
        books.add(new Book(1, "123456789", "Stories", "Green", new Date()));
        books.add(new Book(2, "987654321", "Math 101", "White", new Date()));
        books.add(new Book(3, "123459876", "Intro to Algo", "Steve", new Date()));
        return books;
    }

    public static class Book{
        private int id;
        private String isbn;
        private String name;
        private String author;
        private Date publishDate;

        public Book(int id, String isbn, String name, String author, Date publishDate){
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        public int getId() {
            return id;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Date getPublishDate() {
            return publishDate;
        }

        public void setPublishDate(Date publishDate) {
            this.publishDate = publishDate;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", isbn='" + isbn + '\'' +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publishDate=" + publishDate +
                    '}';
        }
    }
}
