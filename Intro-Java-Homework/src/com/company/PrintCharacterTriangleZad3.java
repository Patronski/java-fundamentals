package com.company;

/**
 * Created by Don on 17.3.2016 г..
 */
public class PrintCharacterTriangleZad3 {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int count = console.nextInt();

        for (int i = 0; i < count ; i++) {
            char letter = 'a';

            for (int j = 0; j < i+1 ; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }

        // miror effect
        for (int i = count-2; i >= 0 ; i--) {
            char letter = 'a';

            for (int j = 0; j < i+1 ; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}
