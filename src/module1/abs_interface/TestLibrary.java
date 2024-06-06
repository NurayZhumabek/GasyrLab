package module1.abs_interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Lev Tolstoy", true);
        Book book2 = new Book("1984", "George Orwell", true);
        Book book3 = new Book("Atomic habits", "James Claire", true);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        LibReader reader = new LibReader("Anna Rob", book1,
                LocalDate.of(2024,5,23));
        LibSupplier supplier = new LibSupplier("Jane Ola", book2 ,
                LocalDate.of(2024,5,29));
        LibLibrarian librarian = new LibLibrarian("Charlie", books);
        LibraryAdmin administrator = new LibraryAdmin("Diana");

        // Reader borrows a book
        reader.borrowBook(book1);

        // Administrator issues a notification
        administrator.overdueNotification(reader);

        // Advance time to simulate overdue
        reader.setRentOfBook(LocalDate.now().minusDays(15));
        administrator.overdueNotification(reader);
    }
}
