package module1.project;

public class LenghtOutOfBand extends Exception {
    String msg;

    public LenghtOutOfBand(String message) {
        super(message);
        this.msg = msg;
    }
}
