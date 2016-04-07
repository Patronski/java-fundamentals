package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1ExtractEmails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Pattern emailPattern = Pattern.compile("[\\w]*[.-_]*[\\w]+[@][\\w]+[.-_]*[\\w]+[.][\\w]+");

        Matcher matcher = emailPattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
