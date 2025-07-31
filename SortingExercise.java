package main.java;

import java.util.Arrays;

public class SortingExercise {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, -8, 11, 3, 12};
        //System.out.println(Arrays.toString(array));
        SortingExercise.sort(array);
        //System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest1 > array[i]) {
                smallest1 = array[i]; 
            } 
        } 
        return smallest1;
    } 

    public static int indexOfSmallest(int[] array) {
        int smallestIndex1 = 0;
        int smallest1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest1 > array[i]) {
                smallest1 = array[i]; 
                smallestIndex1 = i;
            } 
        } 
        return smallestIndex1;
    } 

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex1 = startIndex;
        int smallest1 = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (smallest1 > table[i]) {
                smallest1 = table[i]; 
                smallestIndex1 = i;
            } 
        } 
        return smallestIndex1;
    } 

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index2];
        array[index2] = array[index1];
        array[index1] = helper;
    }

    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
            System.out.println("");
        }
    }


}
