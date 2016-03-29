package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 28.3.2016 г..
 */
public class P2SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split(" ");

        System.out.print(words[0] + " ");
        if(words.length>1) {
            for (int i = 1; i < words.length; i++) {

                if (words[i - 1].equals(words[i])) {
                    System.out.print(words[i] + " ");
                } else {
                    System.out.println();
                    System.out.print(words[i] + " ");
                }
            }
        }
    }
}
