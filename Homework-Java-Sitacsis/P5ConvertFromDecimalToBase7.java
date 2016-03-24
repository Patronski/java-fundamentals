package com.company;

/**
 * Created by maggie on 21.3.2016 г..
 */
public class P5ConvertFromDecimalToBase7 {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int decimalNum = console.nextInt();
        console.close();

        String base7 = "";
        while (true){
            int chastno = decimalNum / 7;
            base7 = base7 + Integer.toString(decimalNum % 7);
            decimalNum = chastno;
            if(decimalNum == 0) break;
        }

        StringBuilder reverse = new StringBuilder(base7).reverse();
        System.out.println(reverse);
    }
}
