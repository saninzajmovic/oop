package org.example.week13.Task6;

import java.util.List;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public EspressoBuilder() {
        this.coffee = new Coffee();
        this.coffee.setType("Espresso");
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
