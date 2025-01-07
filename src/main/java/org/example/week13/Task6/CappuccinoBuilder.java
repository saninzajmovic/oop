package org.example.week13.Task6;

import java.util.List;

public class CappuccinoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public CappuccinoBuilder() {
        this.coffee = new Coffee();
        this.coffee.setType("Cappuccino");
    }

    @Override
    public CoffeeBuilder buildSize(String size) {
        this.coffee.setSize(size);
        return this;
    }

    @Override
    public CoffeeBuilder buildToppings(List<String> toppings) {
        this.coffee.setToppings(toppings);
        return this;
    }

    @Override
    public Coffee build() {
        return this.coffee;
    }
}
