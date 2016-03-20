package com.company;

/**
 * Created by Don on 17.3.2016 г..
 */
public class GhettoNumeralSystemZad5 {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int num = console.nextInt();
        String numAsString = Integer.toString(num); // converting!!!

        // Translate
        for (int i = 0; i < numAsString.length(); i++) {
            char c = numAsString.charAt(i);
            switch (c){
                case '0': System.out.print("Gee"); break;
                case '1': System.out.print("Bro"); break;
                case '2': System.out.print("Zuz"); break;
                case '3': System.out.print("Ma"); break;
                case '4': System.out.print("Duh"); break;
                case '5': System.out.print("Yo"); break;
                case '6': System.out.print("Dis"); break;
                case '7': System.out.print("Hood"); break;
                case '8': System.out.print("Jam"); break;
                case '9': System.out.print("Mack"); break;
            }
        }
    }
}
