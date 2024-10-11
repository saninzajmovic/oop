package org.example.week2;
import java.util.Scanner;
import java.util.Random;

//10 In this exercise, you need to create a guess number game. The user enters  a number, which is in the range 0 to 100 (both 0 and 100 are possible).  Then the user has the chance to guess once, what the number is. The program should print "The number is lower", "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed. The guessing should be made repeatedly until the user types the right number. The program also needs to include a variable of type int, which is used to count the guesses the user has made. The program should always print the number of guesses along with the answer.

public class task10 {

    public static void main(String[] args) { Random rand = new Random(); Scanner input = new Scanner(System.in); int randomNumber=rand.nextInt(101); int guess, numberOfGuesses = 0; System.out.print("Guess the number : "); guess = input.nextInt(); do { numberOfGuesses++; if(guess > randomNumber) { System.out.println("Lower!  -  This is your " + numberOfGuesses + ". guess !"); } else { System.out.println("Higher!  -  This is your " + numberOfGuesses + ". guess !"); } guess = input.nextInt(); } while(guess != randomNumber); System.out.println("You are correct!\nYou made " + numberOfGuesses + " guesses !"); }





















    /*
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber=rand.nextInt(101);
        int guess, numberOfGuesses = 0;
        //System.out.println(randomNumber);
        System.out.print("Guess the number : ");
        guess = input.nextInt();
        do {
            numberOfGuesses++;
            if(guess > randomNumber) {
                System.out.println("Lower!  -  This is your " + numberOfGuesses + ". guess !");
            } else {
                System.out.println("Higher!  -  This is your " + numberOfGuesses + ". guess !");
            }
            guess = input.nextInt();
        }
        while(guess != randomNumber);
        System.out.println("You are correct!\nYou made " + numberOfGuesses + " guesses !");
    }
    */
}
