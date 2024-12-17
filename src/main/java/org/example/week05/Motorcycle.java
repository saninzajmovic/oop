package org.example.week5;

public class Motorcycle extends Vehicle{

    public Motorcycle(String modelName) {
        super(modelName);
    }

    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    public String service() {
        return "Checked some motorcycle component for " + this.getModelName() + ", " + this.getMileage() + " miles, " + this.getHealth() + " health";
    }

    public int expectedLifespan() {
        return 50000;
    }

    public void race(int raceMiles) {
        this.setMileage(this.getMileage() + raceMiles);
        this.setHealth(this.getHealth() - raceMiles/this.getHealth());

        /// If health falls below 40, reduce the remaining lifespan by 5,000 miles due to the increased strain from racing.
        // still dont understand this
        if(this.getHealth() < 40) {
            expectedLifespan();
        }
    }
}
