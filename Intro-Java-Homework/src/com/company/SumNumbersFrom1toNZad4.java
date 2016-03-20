package com.company;

/**
 * Created by Don on 17.3.2016 г..
 */
public class SumNumbersFrom1toNZad4 {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);
        // read
        int N = console.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
