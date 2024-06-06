package module1.abs_interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    Book book;
    List<Book> books;
    LocalDate rentOfBook;

    public User(String name,  List<Book> books) {
        this.name = name;
        this.books = (books != null) ? books : new ArrayList<>(); // Ensure books is not null

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Book book, LocalDate rentOfBook) {
        this.name = name;
        this.book = book;
        this.rentOfBook = rentOfBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public LocalDate getRentOfBook() {
        return rentOfBook;
    }

    public void setRentOfBook(LocalDate rentOfBook) {
        this.rentOfBook = rentOfBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", books=" + books +
                ", rentOfBook=" + rentOfBook +
                '}';
    }
}
