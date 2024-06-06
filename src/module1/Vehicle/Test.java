package module1.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
     Vehicle car=new Vehicle(220,4);
     Car bmw=new Car(230,4,"auto",4);
     Truck kamaz=new Truck(120,2,5);
     Bike sportBike=new Bike(5,1,true);



     List<Vehicle> vehicles=new ArrayList<>();
     vehicles.add(car);
     vehicles.add(bmw);
     vehicles.add(kamaz);
     vehicles.add(sportBike);

        for (Vehicle v:vehicles ){
            System.out.println(v);
        }

     car.setCapacity(-1);
     kamaz.setCargoCapacity(1);


    }
}
