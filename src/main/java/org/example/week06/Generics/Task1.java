package org.example.week6.Generics;
import java.util.*;

/// Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

public class Task1 {

    public static <T extends Number> HashMap<String, Integer> sums(List<T> list) {
        int sumEven = 0;
        int sumOdd = 0;

        for (T number : list) {
            if (number instanceof Integer) {
                int valueOfNumber = number.intValue();
                if (valueOfNumber % 2 == 0) {
                    sumEven += valueOfNumber;
                } else {
                    sumOdd += valueOfNumber;
                }
            }
        }
        HashMap<String, Integer> results = new HashMap<>();
        results.put("Sum of even", sumEven);
        results.put("Sum of odd", sumOdd);
        return results;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1 ,2 ,3 ,4 ,5 , 6, 7);
        HashMap<String, Integer> result = sums(numbers);
        System.out.println(result);

    }
}
