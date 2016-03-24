package com.company;

/**
 * Created by maggie on 21.3.2016 г..
 */
public class P6ConvertFromBase7ToDecimal {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);
        // cur * i^pow
        int base7Num = console.nextInt();
        console.close();

        String base7 = Integer.toString(base7Num);
        int rezult = 0;
        for (int i = 0; i <base7.length(); i++) {
            int pow = base7.length() -1 - i;
            int currentnum = Character.getNumericValue( base7.charAt(i));
            rezult += currentnum * Math.pow(7, pow);
        }

        System.out.println(rezult);
    }
}
