package org.example.week4.shapes;

public abstract class Shape {
    public String color;
    public FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public void displayInfo() {
        System.out.println(color);
    }

}
