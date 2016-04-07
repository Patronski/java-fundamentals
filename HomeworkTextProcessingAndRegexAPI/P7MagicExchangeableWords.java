package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by maggie on 7.4.2016 г..
 */
public class P7MagicExchangeableWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();

        System.out.println(exchangeable(one, two));
    }

    private static boolean exchangeable(String one, String two) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < one.length(); i++) {
            if ( !hashMap.containsKey(one.charAt(i)) )
                hashMap.put(one.charAt(i), two.charAt(i));
            else if ( hashMap.get(one.charAt(i)) != two.charAt(i) ) {
                return false;
            }
        }
        return true;
    }
}
