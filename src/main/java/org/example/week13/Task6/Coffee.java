package org.example.week13.Task6;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String type;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
