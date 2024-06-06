package module1.abs_interface;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        // Create some book instances
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", true);
        Book book2 = new Book("1984", "George Orwell", true);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", true);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        LibReader reader = new LibReader("Alice", books);

        reader.borrowBook(book1);
    }
}
