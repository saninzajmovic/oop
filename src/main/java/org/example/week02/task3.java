package org.example.week2;
import java.util.Scanner;

//3. Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=-1, sum=0;
        while(num != 0) {
            System.out.print("Enter number: ");
            num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum is: " + sum);
    }
}
