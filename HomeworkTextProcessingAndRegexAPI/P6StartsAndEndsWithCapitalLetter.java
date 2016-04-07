package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by maggie on 5.4.2016 г..
 */
public class P6StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Pattern pattern = Pattern.compile("[A-Z][A-Za-z]*[A-Z]");

        Matcher matcher;

        for (int i = 0; i < words.length; i ++) {
            matcher = pattern.matcher(words[i]);
            if (matcher.matches()) {
                System.out.print(words[i] + " ");
            }
        }

    }
}
