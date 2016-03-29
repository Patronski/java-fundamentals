package com.company;

import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P5CountAllWords {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split("\\W+|[ ]");

        System.out.println(words.length);
    }
}
