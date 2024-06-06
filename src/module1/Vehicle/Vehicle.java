package module1.Vehicle;

public class Vehicle {
    private int speed;
    private int capacity;

    public Vehicle() {
    }

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity<1){
            System.out.println("The capacity must be greater than 0!");
        }
        this.capacity = capacity;
    }

    public void gas(){
        System.out.println("Drive the vehilce!");
    }

    public void stop(){
        System.out.println("Stop!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", capacity=" + capacity +
                '}';
    }
}
