package com.company;

import java.util.Scanner;

public class P1SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] arrayOfN = new int[n];

        for (int i = 0; i < arrayOfN.length; i++) {

            arrayOfN[i] = console.nextInt();
        }
        console.close();

        java.util.Arrays.sort(arrayOfN); // build in sort

        for (int i = 0; i < arrayOfN.length; i++) {

            System.out.println(arrayOfN[i]);
        }

    }
}
