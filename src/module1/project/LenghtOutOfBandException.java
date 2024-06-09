package module1.project;

public class LenghtOutOfBandException extends Exception {
    String msg;

    public LenghtOutOfBandException(String message) {
        super(message);
        this.msg = msg;
    }
}
