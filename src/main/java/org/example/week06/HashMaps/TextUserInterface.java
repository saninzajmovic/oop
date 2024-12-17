package org.example.week6.HashMaps;
import java.util.*;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void add() {
        String word, translation;
        System.out.println("Enter a word, later its translation");
        System.out.print("Word: ");
        word = reader.nextLine();
        System.out.print("Translation: ");
        translation = reader.nextLine();
        dictionary.add(word, translation);
    }

    public void translate() {
        String toBeTranslated;
        System.out.print("Enter a word you want translated: ");
        toBeTranslated = reader.nextLine();
        if (dictionary.translate(toBeTranslated).length() > 3) {
            System.out.println(dictionary.translate(toBeTranslated));
        } else {
            System.out.println("Translation of \"" + toBeTranslated + "\" is: " + dictionary.translate(toBeTranslated));
        }
    }

    public void start() {
        System.out.println("Statement");
        System.out.println("\tquit - quit the text user interface");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tadd - adds a word pair to the dictionary");

        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String statement = reader.nextLine();

            if (statement.equalsIgnoreCase("quit")) {
                System.out.println("Cheers");
                break;
            } else if (statement.equalsIgnoreCase("add")) {
                // handlaj ovo
                add();
            } else if (statement.equalsIgnoreCase("translate")) {
                // handlaj ovo
                translate();
            } else {
                System.out.println("Unknown statement");
            }

        }

    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
