package org.example.week5;

public abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this(modelName, 0, 100);
    }

    public Vehicle(String name, int mileage, int health) {
        this.modelName = name;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract String service();

    public abstract int expectedLifespan();

    public boolean needsMaintenance() {
        return this.health < 70;
    }

    public int calculateRemainingLifespan() { // estimated remaining mileage
        return this.health * (1000 - this.mileage);
    }

    public void simulateYear() {
        if(this.getHealth() < 50) {
            this.setHealth(this.getHealth() - 5);
        }
    }

    public void performMaintenance(Vehicle vehicle) {
        if(vehicle instanceof Car) {
            Car localCar = (Car) vehicle;
            localCar.repair();
            localCar.drive(80);
        }
        if(vehicle instanceof Truck) {
            Truck localTruck = (Truck) vehicle;
            localTruck.repair();
            localTruck.haul(42000);
        }
        if(vehicle instanceof Motorcycle) {
            Motorcycle localMotorcycle = (Motorcycle) vehicle;
            localMotorcycle.race(50);
        }
    }
}
