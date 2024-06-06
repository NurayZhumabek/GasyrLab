package module1.abs_interface;

public class Book {
    private String title;
    private String author;
    private boolean available;


    public Book(String title, String author,boolean available) {
        this.title = title;
        this.author = author;
        this.available=true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()){
            System.out.println("The title of the book cannot be empty!");
        }
        else {
            this.title = title;

        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.isEmpty()){
            System.out.println("The author of the book cannot be empty!");
        }
        else {
            this.author = author;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
