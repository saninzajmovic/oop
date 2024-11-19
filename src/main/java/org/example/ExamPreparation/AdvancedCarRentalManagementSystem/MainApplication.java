package org.example.ExamPreparation.AdvancedCarRentalManagementSystem;
import java.util.*;

public class MainApplication {
}

enum CarType {
    SEDAN, SUV, TRUCK, VAN, SPORTS
}

interface Rentable {
    double applyDiscountRate(double discountRate);
    String getDescription();
}

abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String name;
    private double rentalRate;
    private HashMap<Date, Integer> kilometersRecord;

    public double applyDiscountRate(double discountRate) {
        return this.rentalRate * (1-discountRate);
    }

    public String getDescription() {
        return "Name: " + this.name + ", Rental rate (without dicount): " + this.rentalRate;
    }

    public Vehicle(String vehicleId, String name, double rentalRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.rentalRate = rentalRate;
    }

    public String getVehicleId() {
        return this.vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRentalRate() {
        return this.rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void addKilometers(Date rentalDate, int kilometers) {
        kilometersRecord.put(rentalDate, kilometers);
    }

    public int getKilometers() {
        int totalKilometers = 0;
        for (Map.Entry<Date, Integer> record : kilometersRecord.entrySet()) {
            totalKilometers += record.getValue();
        }
        return totalKilometers;
    }
}

class Car extends Vehicle {
    private CarType carType;
    private String engineType;

    public Car(String vehicleId, String name, double rentalRate, CarType carType, String engineType) {
        super(vehicleId, name, rentalRate);
        this.carType = carType;
        this.engineType = engineType;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Car type: " + this.carType + ", Engine type: " + this.engineType;
    }

    public CarType getCarType() {
        return this.carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCpacity) {
        super(vehicleId, name, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Engine capacity: " + this.engineCapacity;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

class RentalTransaction<T extends Vehicle & Rentable> {
    private String transactionId;
    private Date rentalDate;
    private HashMap<T, Integer> rentedVehicles;
    private int customerId;

    public RentalTransaction(String transactionId, Date rentalDate, int customerId) {
        this.transactionId = transactionId;
        this.rentalDate = rentalDate;
        this.customerId = customerId;
    }

    public void addVehicleToRental(T vehicle, int days) {
        rentedVehicles.put(vehicle, days);
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Map.Entry<T, Integer> entry : rentedVehicles.entrySet()) {
            totalAmount += entry.getValue() * entry.getKey().applyDiscountRate(0);
        }
        return totalAmount;
    }
}