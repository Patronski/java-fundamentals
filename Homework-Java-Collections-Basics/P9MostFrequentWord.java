package com.company;

import java.util.*;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P9MostFrequentWord {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split("\\W+|[ ]");

        Set<String> set = new TreeSet<>();

        for (String word : words) {
            set.add(word.toLowerCase());
        }

        Map<String, Integer> map = new TreeMap<>();
        int maxCount= 0;
        for (String word : set) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (word.equalsIgnoreCase(words[i])) {
                    count++;
                }
            }
            if(count > maxCount) maxCount = count;
            map.put(word, count);
        }

        for (Map.Entry entry : map.entrySet()) {
            if((Integer)entry.getValue() == maxCount){
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }


    }
}
