package org.example.week6.part0;

public class task2 {
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("Index of smallest: " + indexOfSmallest(values));
    }
}
