package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by maggie on 5.4.2016 г..
 */
public class P5ExtractWords {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }


    }
}
