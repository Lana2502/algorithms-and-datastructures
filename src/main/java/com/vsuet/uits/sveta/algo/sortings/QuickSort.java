package com.vsuet.uits.sveta.algo.sortings;

public class QuickSort {
    private int partition(final int arr[], final int low, final int high) {
        final int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    private void sort(final int arr[], final int low, final int high) {
        if (low < high) {
            final int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }


    private static void printArray(final int arr[]) {
        for (final int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        final int arr[] = {12, 6, 9, 2, 4, 3};
        final int n = arr.length;
        final QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        System.out.println("sorted array");
        printArray(arr);
    }
}
