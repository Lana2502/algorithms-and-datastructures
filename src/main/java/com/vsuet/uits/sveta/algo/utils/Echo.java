package com.vsuet.uits.sveta.algo.utils;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Echo {
    public static void main(String[] args) {
        AtomicReference<String> inData;
        inData = new AtomicReference();
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());
    }
}


