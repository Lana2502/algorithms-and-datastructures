package com.vsuet.uits.sveta.algo.rec;

public class PrintMessage{
    private static void printNTimes(final int n, final String message){
        if (n != 0) {
            System.out.println(message);
            printNTimes(n-1, message);
        }
    }
    public static void main(final String[] args) {
        printNTimes(5, "SOS");
    }
}