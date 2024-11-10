package org.example.week6.Generics;
import java.util.*;

/// Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.

public class Task2 {

    public static <T> List<T> reverser(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        List<String> reversedWords = reverser(words);
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 5);
        List<Integer> reversedNums = reverser(nums);
        System.out.println("Original list: " + words);
        System.out.println("Reversed list: " + reversedWords);
        System.out.println("Original list: " + nums);
        System.out.println("Reversed list: " + reversedNums);
    }
}
