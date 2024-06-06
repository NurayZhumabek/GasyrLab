package module1.abs_interface;

import module1.abs_interface.Administrator;
import module1.abs_interface.Book;
import module1.abs_interface.Reader;
import module1.abs_interface.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class LibraryAdmin extends User implements Administrator {
    public LibraryAdmin(String name) {
        super(name);
    }

    @Override
    public void searchBook(Book book) {
        for (Book b:books){
            if (b.equals(book)){
                System.out.printf("The book %s is on the list of Library.Current status of available - %s",
                        b.getTitle(),b.isAvailable() ?"Available" : "Not Available");
            }
        }
    }



    @Override
    public void overdueNotification(LibReader reader) {
        long daysBorrowed = ChronoUnit.DAYS.between(reader.getRentOfBook(), LocalDate.now());
        if (reader.getRentOfBook()!=null){
        if(daysBorrowed>14){
            System.out.format("Reader %s has overdue the book %s by %d days%n",
                    reader.getName(),reader.getBooks(),daysBorrowed-14);
            for(Book b: reader.getBooks()){
                if (!b.isAvailable()){
                    System.out.format("Overdue book: %s by %s%n", b.getTitle(), b.getAuthor());
                }

            }

        }
        else{
            System.out.format("Reader %s has no overdue books%n", reader.getName());
        }
        }
        else{
            System.out.format("Reader %s has no borrowed books%n", reader.getName());
        }

    }
}
