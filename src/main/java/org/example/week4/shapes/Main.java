package org.example.week4.shapes;

public class Main {
    public static void main(String[] args) {
        Circle krug = new Circle("blue", FillType.FILLED, 3.2);
        Rectangle rect = new Rectangle("green", FillType.NOT_FILLED, 2, 4);

        krug.displayInfo();
        rect.displayInfo();
    }
}
