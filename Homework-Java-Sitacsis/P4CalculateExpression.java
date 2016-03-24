package com.company;

/**
 * Created by maggie on 21.3.2016 г..
 */
public class P4CalculateExpression {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        console.close();

        double partOfFormula1 = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));

        double formula1 = Math.pow(partOfFormula1, (a + b + c) / Math.sqrt(c) );

        double formula2 = Math.pow( (a*a + b*b - c*c*c), (a - b) );

        double difference = Math.abs((a+b+c)/3 - (formula1 + formula2) / 2); // average of a,b,c - f1,f2

        //System.out.println("F1 result: " + formula1 + "; F2 result: " + formula2 + "; Diff: " + difference);
        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", formula1, formula2, difference);
    }
}
