package org.example.week5;

public class Car extends Vehicle implements Repairable {

    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    public String repair() {
        return "Engine tuned and oid changed for " + this.getModelName();
    }

    public String service() {
        return "Checking engine and changing oil to " + this.getModelName() + ", " + this.getMileage() + " miles, " + this.getHealth() + " health";
    }

    public int expectedLifespan() { // dont understand this question, we literally already made calculateRemainingLifespanmethod in the Vehicle class
        return 150000;
    }

    public void drive(int miles) { // i had to add methods setMileage and setHealth in order to make this method possible
        this.setMileage(this.getMileage() + miles);
        this.setHealth(this.getHealth() - miles/100);

        /// "If the health drops below 30, reduce the expected lifespan by an additional 10,000 miles."
        // i truly do not understand how to implement this since lifespan is not a variable and the method expextedLifespan just returns 150000, i cant make it return 140000 later
        if(this.getHealth() < 30) {
            expectedLifespan();
        }
    }




}
