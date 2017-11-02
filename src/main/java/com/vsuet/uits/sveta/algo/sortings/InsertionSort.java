package com.vsuet.uits.sveta.algo.sortings;

public class InsertionSort {
    private static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    public static void main(String a[]){
        int[] arr1 = {8,20,1,4,37,13,54,27};
        System.out.println("До InsertionSort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr1);
        System.out.println("После InsertionSort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}