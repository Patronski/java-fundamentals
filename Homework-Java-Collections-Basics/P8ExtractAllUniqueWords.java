package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P8ExtractAllUniqueWords {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split("\\W+|[ ]");

        Set<String> set = new TreeSet<>();

        for (String word : words) {
            set.add(word.toLowerCase());
        }

        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
