package com.vsuet.uits.sveta.algo.sortings;

public class SelectionSort {
    public static void main(String[] args){
        int[]m = new int[(int)(Math.random()*100+1)];
        for (int i=0; i < m.length; i++){
            m[i]=(int)(Math.random()*100+1);
            System.out.print(m[i] + " ");
        }
        System.out.println( );
        for(int i=0; i<m.length; i++){
            int min = m[i];
            int lmin = i;
            for(int j = i+1; j<m.length; j++){
                if (m[j]< min){
                    min = m[j];
                    lmin = j;
                }
            }
            if (i !=lmin){
                int temp = m[i];
                m[i] = m [lmin];
                m[lmin] = temp;
            }
            System.out.print(m[i] + " ");
        }
    }
}
