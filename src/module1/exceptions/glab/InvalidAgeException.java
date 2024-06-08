package module1.exceptions.glab;

public class InvalidAgeException extends Exception {
    String msg;

    public InvalidAgeException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
