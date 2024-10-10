package org.example.week1;
import java.util.Scanner;

//6. Create a program that asks the user for two numbers and prints the greater of those two. The program should also handle the case in which the two numbers are equal.

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if(num1 < num2) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println("Equal");
        }
    }
}
