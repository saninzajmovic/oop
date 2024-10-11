package org.example.week2;
import java.util.Scanner;

//6. Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break.  Users should be able to enter  how many times the text should be printed.

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hepek = "In the beginning there were the swamp, the hoe and Java.\n";
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for(int i=0; i<num; i++) {
            System.out.print(hepek);
        }
    }
}
