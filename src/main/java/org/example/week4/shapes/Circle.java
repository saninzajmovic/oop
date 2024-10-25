package org.example.week4.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.color + " " + this.fillType + " " + this.radius);
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
