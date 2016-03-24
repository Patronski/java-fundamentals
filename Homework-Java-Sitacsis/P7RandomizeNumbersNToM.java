package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by maggie on 22.3.2016 г..
 */
public class P7RandomizeNumbersNToM {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int N = console.nextInt();
        int M = console.nextInt();
        console.close();
        int max = Math.max(N,M);
        int min = Math.min(N,M);

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            array.add(i);
        }

        Collections.shuffle(array);

        for (Integer number: array) {
            System.out.print(number + " ");
        }
    }
}
