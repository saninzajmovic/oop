package org.example.week2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0;
        for(int i=0; i<3; i++) {
            num = input.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
