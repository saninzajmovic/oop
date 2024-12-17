package org.example.week6.LibraryInformationSystem;

public class StringUtils {

    public static boolean included(String word, String searched) {
        // searched jel unutar word
        //return searched.trim().toUpperCase().contains(word.toUpperCase());
        return word.toUpperCase().contains(searched.trim().toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.included("THIS s", "this"));
        System.out.println(StringUtils.included("this", "THIS"));
        System.out.println(StringUtils.included("This", "     this"));
        System.out.println(StringUtils.included("This", "this      "));
        System.out.println(StringUtils.included("This", "     this    "));
        System.out.println(StringUtils.included("THIS", "tis"));
        System.out.println(StringUtils.included("TIS", "this"));
    }
}
