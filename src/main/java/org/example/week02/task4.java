package org.example.week2;
import java.util.Scanner;

//4. Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop. If the first number is greater than the last number, the program prints those numbers.

public class task4 {
    public static void printNumbersBetween(int num1, int num2) {
        while(num1+1 < num2) {
            System.out.print(num1+1 + " ");
            num1++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 < num2) {
            printNumbersBetween(num1, num2);
        } else {
            printNumbersBetween(num2, num1);
        }
    }
}
