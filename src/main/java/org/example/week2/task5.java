package org.example.week2;

//5. Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user. The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power). Note that the command returns a number of double types (i.e. floating point number). A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23 to the variable result.

public class task5 {
    public static void main(String[] args) {
        /*
        int num=4, result=0;
        for(int i=0; i<num+1; i++) {
            result += (int)Math.pow(2,i);
        }
        System.out.println(result);
        */

        int num=4;
        System.out.println((int)Math.pow(2,num+1)-1);
    }
}
