package org.example.week13.Task6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();

        CoffeeBuilder coffeeCappuccinoBuilder = new CappuccinoBuilder()
                .buildSize("large")
                .buildToppings(Arrays.asList("cokolada, slag"));
        Coffee cappuccino = coffeeDirector.constructCoffee(coffeeCappuccinoBuilder);

        CoffeeBuilder coffeeEspressoBuilder = new EspressoBuilder()
                .buildSize("small");
        Coffee espresso = coffeeDirector.constructCoffee(coffeeEspressoBuilder);

        CoffeeBuilder coffeeLatteBuilder = new LatteBuilder()
                .buildSize("medium")
                .buildToppings(Arrays.asList("caramel"));
        Coffee latte = coffeeDirector.constructCoffee(coffeeLatteBuilder);

    }
}
