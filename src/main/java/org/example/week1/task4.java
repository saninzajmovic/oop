package org.example.week1;
import java.util.Scanner;

//4. Create a program that asks the user for two integers and then prints their sum.

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println(num1 + num2);
    }
}
