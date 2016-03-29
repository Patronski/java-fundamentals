package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P7CombineListOfLetters {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String l1 = console.nextLine();
        String l2 = console.nextLine();

        String[] chars1 = l1.split(" ");
        String[] chars2 = l2.split(" ");

        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < chars1.length; i++) {
            list1.add(chars1[i].charAt(0));
        }

        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < chars2.length; i++) {
            list2.add(chars2[i].charAt(0));
        }

        for (Character character : list1) {
            System.out.print(character + " ");
        }

        for (Character character : list2) {
            if (!list1.contains(character)) {
                System.out.print(character + " ");
            }
        }
    }
}
