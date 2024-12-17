package org.example.week1;
import java.util.Scanner;

//5. Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 0) {
            System.out.println("Positive");
        } else if(num < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
