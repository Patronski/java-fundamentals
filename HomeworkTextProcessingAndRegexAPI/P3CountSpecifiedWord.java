package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by maggie on 5.4.2016 г..
 */
public class P3CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().toLowerCase().split("\\W+");
        String substring = sc.nextLine().toLowerCase();

        int counterOfSearchedWord = 0;
        for (String s : input) {
            if(substring.equals(s)){
                counterOfSearchedWord++;
            }
        }
        System.out.println(counterOfSearchedWord);

        // less working :D
//        Pattern pattern = Pattern.compile("[\\W 0-9](" + substring + ")[ \\W0-9]", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(input);
//
//        int occurrencesCount = 0;
//        while(matcher.find()) {
//            occurrencesCount++;
//            System.out.println(matcher.group());
//        }
//        System.out.println(occurrencesCount);
    }
}
