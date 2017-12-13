package com.vsuet.uits.sveta.algo.sortings;

public class BubbleSort {
    public static void main(String[] args) {
        Integer []m = {23, 36, 12, 3, -20, 32, 44, 1, 13};
        for (int i = 0; i < m.length; i++ ){
            int num = m[i];
            for (int j = i - 1; j >= 0; j--){
                int leftNumber = m[j];
                if (num < leftNumber){
                    m[j+1]=leftNumber;
                    m[j]= num;
                }else{
                    break;
                }
            }
        }
        for (Integer n :  m){
            System.out.print(n + " ");
        }
    }
}