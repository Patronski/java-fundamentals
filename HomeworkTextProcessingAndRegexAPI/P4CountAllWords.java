package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maggie on 5.4.2016 г..
 */
public class P4CountAllWords {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] input = console.readLine().toLowerCase().split("\\W+");

        System.out.println(input.length);
    }
}
