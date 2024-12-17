package org.example.week2;

//7. Create a method called drawStarsPiramid that will accept the number of rows as a parameter and print a half pyramid shape where the number of rows will be dictated by the sent parameter.

public class task7 {
    public static void drawStarsPiramid(int num) {
        for(int i=1; i<num+1; i++) {
            System.out.println("* ".repeat(i));
        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(5);
    }
}
