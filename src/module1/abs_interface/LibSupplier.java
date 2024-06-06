package module1.abs_interface;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class LibSupplier extends User implements Supplier,Reader{
    public LibSupplier(String name, Book book, LocalDate rentOfBook) {
        super(name, book, rentOfBook);
    }

    @Override
    public void deliverBook(Book book, LibLibrarian librarian) {
    books.add(book);
        System.out.format("The book %s was delivered to librarian %s%n ",book.getTitle(),librarian.getName());
    }

    @Override
    public void borrowBook(Book book) {

        for (Book b:books){
            if (b.equals(book) && b.isAvailable()){
                System.out.format("Supplier %s boorrowed book %s%n ",b.getTitle(),super.getName());
                b.setAvailable(false);
                return;
            }
        }
        System.out.format("Book %s is not available for borrowing%n", book.getTitle());
    }

    @Override
    public void returnBook(Book book) {
        for (Book b:books){
            if (b.equals(book) &&  !b.isAvailable()){
                System.out.format("Supplier %s returned book %s%n ",b.getTitle(),super.getName());
                b.setAvailable(true);
                return;
            }
        }
        System.out.format("Book %s was not borrowed %n", book.getTitle());
    }
    }

