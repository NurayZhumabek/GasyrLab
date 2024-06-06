package module1.abs_interface;

import java.util.List;

public class LibLibrarian extends User implements Librarian{
    public LibLibrarian(String name, List<Book> books) {
        super(name, books);
    }

    @Override
    public void orderBook(Book book, Supplier supplier) {
        System.out.format("Librarian %s ordered book %s from supplier %s%n", super.getName(), book.getTitle(), ((LibSupplier) supplier).getName());
        supplier.deliverBook(book, this);

    }
}
