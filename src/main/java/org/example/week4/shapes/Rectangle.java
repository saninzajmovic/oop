package org.example.week4.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.color + " " + this.fillType + " " + this.width + " " + this.height);
    }

    public double getArea() {
        return this.width * this.height;
    }
}
