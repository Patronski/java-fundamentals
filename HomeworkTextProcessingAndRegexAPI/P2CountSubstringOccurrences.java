package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by maggie on 5.4.2016 г..
 */
public class P2CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String substring = sc.nextLine();

        Pattern pattern = Pattern.compile(substring, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        int occurrencesCount = 0;
        int index = 0;
        while(matcher.find(index)) {
            occurrencesCount++;
            index = matcher.start() +1;
        }
        System.out.println(occurrencesCount);

        // method without pattern
//        String input = sc.nextLine().toLowerCase();
//
//        String substring = sc.nextLine().toLowerCase();
//
//        int fromIndex = 0;
//        int occurrencesCounter = 0;
//        while( input.indexOf(substring, fromIndex) != -1) {
//            fromIndex = input.indexOf(substring, fromIndex)+1;
//            occurrencesCounter++;
//        }
//
//        System.out.println(occurrencesCounter);
    }
}
