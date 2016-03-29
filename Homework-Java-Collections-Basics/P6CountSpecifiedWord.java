package com.company;

import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P6CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String searchedWord = console.nextLine();
        console.close();

        String[] words = input.split("\\W+|[ ]");

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchedWord)) {
                counter++;
            }
        }

        //rezult
        System.out.println(counter);
    }
}
