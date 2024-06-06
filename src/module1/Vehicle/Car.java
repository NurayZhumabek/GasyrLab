package module1.Vehicle;

public class Car extends Vehicle{

    protected String type;
    protected int countOfDoors;

    public Car() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.isEmpty())
            System.out.println("The type of car must be automatic or mechanical!");
        else
            this.type = type;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        if (countOfDoors<1)
            System.out.println("This value is not possible!");
        this.countOfDoors = countOfDoors;
    }

    public Car(String type, int countOfDoors) {
        this.type = type;
        this.countOfDoors = countOfDoors;
    }

    public Car(int speed, int capacity, String type, int countOfDoors) {
        super(speed, capacity);
        this.type = type;
        this.countOfDoors = countOfDoors;
    }

    @Override
    public void gas() {
        super.gas();
        System.out.println("The car is coming");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("The car stopped");
    }

    @Override
    public String toString() {
        super.toString();
        return "Car{" +
                "type='" + type + '\'' +
                ", countOfDoors=" + countOfDoors +
                '}';
    }
}
