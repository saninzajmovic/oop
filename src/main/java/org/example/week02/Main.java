package org.example.week2;

public class Main {
    public static void main(String[] args) {
        /*
        1. Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.

        2. Create a program that asks the user for three numbers and then prints their sum.

        3. Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.

        4. Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop.
        If the first number is greater than the last number, the program prints those numbers.

        5. Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user. The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power). Note that the command returns a number of double types (i.e. floating point number). A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23 to the variable result.


        6. Create a method printText that prints the following string of characters: "In the beginning there were the swamp, the hoe and Java." and a line break.  Users should be able to enter  how many times the text should be printed.

        7. Create a method called drawStarsPiramid that will accept the number of rows as a parameter and print a half pyramid shape where the number of rows will be dictated by the sent parameter.
        drawStarsPiramid(5);

        8. Write a program to print the inverted half pyramid shape as shown in the image below?

        9. Modify the previously created starts piramid in a way that now you are not printing the stars but in each row numbers from 1 to the current row count.
        drawNumbersPiramid(5);

        10. In this exercise, you need to create a guess number game. The user enters  a number, which is in the range 0 to 100 (both 0 and 100 are possible).  Then the user has the chance to guess once, what the number is. The program should print "The number is lower", "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed. The guessing should be made repeatedly until the user types the right number. The program also needs to include a variable of type int, which is used to count the guesses the user has made. The program should always print the number of guesses along with the answer. In the end your game should look like this:

         */

        //TASK 1
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
}
