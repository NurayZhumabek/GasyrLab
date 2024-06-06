package module1.abs_interface;

import java.time.LocalDate;
import java.util.List;

public class LibReader extends User implements Reader {

    public LibReader(String name, List<Book> books) {
        super(name, books);
    }

    @Override
    public void borrowBook(Book book) {
        if (books == null) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            if (b.equals(book) && b.isAvailable()) {
                System.out.format("Reader %s borrowed book %s%n", super.getName(), b.getTitle());
                b.setAvailable(false);
                setRentOfBook(LocalDate.now()); // Set the rent date to the current date
                return;
            }
        }
        System.out.format("Book %s is not available for borrowing%n", book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        if (books == null) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            if (b.equals(book) && !b.isAvailable()) {
                System.out.format("Reader %s returned book %s%n", super.getName(), b.getTitle());
                b.setAvailable(true);
                setRentOfBook(null); // Clear the rent date after returning the book
                return;
            }
        }
        System.out.format("Book %s was not borrowed%n", book.getTitle());
    }
}
