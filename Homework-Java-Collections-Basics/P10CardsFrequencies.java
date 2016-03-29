package com.company;

import java.util.*;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P10CardsFrequencies {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split("([♥♣♦♠]+[\\s])|[♥♣♦♠]");

        Set<String> set = new TreeSet<>();
        for (String word : words) {
            set.add(word);
        }

        for (String word : set) {
            int count = 0;
            for (String s : words) {
                if (s.equals(word)) {
                    count++;
                }
            }
            double percent = 100 / (double) words.length * count;
            System.out.printf("%1s -> %1.2f%%\n", word, percent);
        }
    }
}
