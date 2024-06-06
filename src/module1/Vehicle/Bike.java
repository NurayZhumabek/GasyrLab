package module1.Vehicle;

public class Bike extends Vehicle{
    protected boolean hasBasket;


    public Bike() {
    }

    public Bike(boolean haveBasket) {
        this.hasBasket = haveBasket;
    }

    public Bike(int speed, int capacity, boolean haveBasket) {
        super(speed, capacity);
        this.hasBasket = haveBasket;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    @Override
    public String toString() {
        super.toString();
        return "Bike{" +
                "hasBasket=" + hasBasket +
                '}';
    }
}
