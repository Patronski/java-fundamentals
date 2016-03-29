package com.company;

import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 29.3.2016 г..
 */
public class P12CalculateN {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int num = console.nextInt();

        int factorial = findFactorial(num);
        System.out.println(factorial);
    }
// 5! = 5*4*3*2*1
    private static int findFactorial(int num) {
        int rezult = 1;
        if(num>1) {
            rezult = num * findFactorial(num - 1);
        }
        return rezult;
    }
}
