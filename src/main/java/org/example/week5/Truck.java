package org.example.week5;

public class Truck extends Vehicle implements Repairable{

    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    public String repair() {
        return "Engine overhauled and tires replaced for " + this.getModelName();
    }

    public String service() {
        return "Checked some truck component for " + this.getModelName() + ", " + this.getMileage() + " miles, " + this.getHealth() + " health";
    }

    public int expectedLifespan() {
        return 300000;
    }

    public void haul(int loadWeight) {
        if(loadWeight > 5000) {
            this.setHealth(this.getHealth() - (loadWeight/this.getHealth()));
        }

        ///  "If the health is low after hauling, reduce the remaining lifespan by 20,000 miles."
        // no idea how to do the reduction by 20000
        if(this.getHealth() <= 10) {
            expectedLifespan();
        }
    }
}
