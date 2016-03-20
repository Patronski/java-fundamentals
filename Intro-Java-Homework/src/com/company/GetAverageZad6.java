package com.company;

import java.util.Locale;

/**
 * Created by Don on 17.3.2016 г..
 */
public class GetAverageZad6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        java.util.Scanner console = new java.util.Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double average = calculateAverageOfThreeNumbers(a, b, c);

        System.out.printf( "%.2f", average);
    }

    private static double calculateAverageOfThreeNumbers(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
