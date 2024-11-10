package org.example.week6.part0;
import java.util.*;


class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {

        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == searchedValue) {
                return true;
            }
            if (array[m] < searchedValue) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i=-3; i<15; i++) {
//            boolean result = BinarySearch.search(array, i);
//            System.out.println("i: " + i + " result: " + result);
//        }
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println(result);
    }
}