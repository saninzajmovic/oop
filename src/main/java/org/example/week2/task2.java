package org.example.week2;
import java.util.Scanner;

//2. Create a program that asks the user for three numbers and then prints their sum.

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0;
        for(int i=0; i<3; i++) {
            System.out.print("Enter number " + (i+1) +": ");
            num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum is: " + sum);
    }
}
