package org.example.week13.Task6;

import java.util.List;

public interface CoffeeBuilder {
    CoffeeBuilder buildSize(String size);
    //CoffeeBuilder buildType();
    CoffeeBuilder buildToppings(List<String> toppings);
    Coffee build();
}
