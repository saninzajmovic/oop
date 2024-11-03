package org.example.week5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle[] arr;
        arr = new Vehicle[3];
        arr[0] = new Car("Toytoya");
        arr[1] = new Truck("Vovol");
        arr[2] = new Motorcycle("Kwaksi");

        for(Vehicle v : arr) {
            v.service();
            v.simulateYear();

            if(v instanceof Car) {
                Car localCar = (Car) v;
                localCar.drive(100);
            }
            if(v instanceof Truck) {
                Truck localTruck = (Truck) v;
                localTruck.haul(4999);
            }
            if(v instanceof Motorcycle) {
                Motorcycle localMotorcycle = (Motorcycle) v;
                localMotorcycle.race(100);
            }
        }
    }
}


