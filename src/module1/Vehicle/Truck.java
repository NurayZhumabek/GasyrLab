package module1.Vehicle;

public class Truck extends Vehicle{
    protected int cargoCapacity;

    public Truck() {
    }

    public Truck(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(int speed, int capacity, int cargoCapacity) {
        super(speed, capacity);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity<3){
            System.out.println("The minimum value of a truck must be 3 tones");
        }
        else
            this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        super.toString();
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                '}';
    }
}
