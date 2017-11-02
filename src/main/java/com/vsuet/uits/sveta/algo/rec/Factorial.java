package com.vsuet.uits.sveta.algo.rec;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        final long result = factorial(scanner.nextLong());
        System.out.println("result: " + result);
    }


    private static long factorial (final long number){
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return factorial(number - 1) * number;
        }
    }
}