package com.company;

/**
 * Created by maggie on 21.3.2016 г..
 */
public class P3FormattingNumbers {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();
        console.close();

        String hexadecimal = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ", hexadecimal, Integer.parseInt(binary), b, c);
    }
}
