package org.example.week6.part0;

public class task1 {
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int small : array) {
            if(small < smallest) {
                smallest = small;
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("smallest: " + smallest(values));
    }


}
