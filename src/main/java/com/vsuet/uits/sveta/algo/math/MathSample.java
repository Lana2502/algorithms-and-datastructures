package com.vsuet.uits.sveta.algo.math;

import java.util.Scanner;

public class MathSample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Введите первое число");
        a = sc.nextInt();

        System.out.println("Введите второе число");
        b = sc.nextInt();

        c = a + b;

        System.out.println("c = " + c);
    }
}