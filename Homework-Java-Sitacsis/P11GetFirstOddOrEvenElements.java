package com.company;

/**
 * Created by maggie on 22.3.2016 г..
 */
public class P11GetFirstOddOrEvenElements {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        String[] collection = console.nextLine().split(" ");
        String[] command = console.nextLine().split(" ");
        console.close();

        int maxLength = Integer.parseInt(command[1]);
        String evenOrOdd = command[2];

        returnFromCollection(maxLength, evenOrOdd, collection);
    }

    private static void returnFromCollection(int maxLength, String evenOrOdd, String[] collection) {

        int printed = 0;
        for (int i = 0; i < collection.length && printed<maxLength; i++) {
            if (evenOrOdd.compareTo("even") == 0){
                if (Integer.parseInt(collection[i]) % 2 == 0){
                    System.out.print(collection[i] + " ");
                    printed++;
                }
            }
            else if (evenOrOdd.compareTo("odd") == 0){
                if (Integer.parseInt(collection[i]) % 2 != 0){
                    System.out.print(collection[i] + " ");
                    printed++;
                }
            }
        }
    }
}
