package org.example.week2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "password";
        String guess = "";
        while(!guess.equals(password)) {
            System.out.println("Enter password");
            guess = input.nextLine();
        }
        System.out.println("Correct, secret message: secret message");
    }
}
