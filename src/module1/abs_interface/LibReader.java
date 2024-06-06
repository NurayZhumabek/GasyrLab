package module1.abs_interface;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class LibReader extends User implements Reader{

    public LibReader(String name, Book book, LocalDate rentOfBook) {
        super(name, book, rentOfBook);
    }




    @Override
    public void borrowBook(Book book) {
        for (Book b : books) {
            if (b.equals(book) && b.isAvailable()) {
                System.out.format("Reader %s boorowed book %s%n ", b.getTitle(), super.getName());
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
                System.out.format("Reader %s returned book %s%n ",b.getTitle(),super.getName());
                b.setAvailable(true);
                return;
            }
        }
        System.out.format("Book %s was not borrowed %n", book.getTitle());
    }
    }


