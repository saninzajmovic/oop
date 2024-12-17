package org.example.week2;

//9. Modify the previously created starts piramid in a way that now you are not printing the stars but in each row numbers from 1 to the current row count.

public class task9 {
    public static void drawStarsPiramid(int num) {
        for(int i=1; i<num+1; i++) {
            System.out.println((String.valueOf(i) + " ").repeat(i));
        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(5);
    }
}
