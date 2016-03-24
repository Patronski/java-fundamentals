package com.company;

/**
 * Created by maggie on 22.3.2016 г..
 */
public class P9HitTheTarget {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int input = console.nextInt();
        console.close();

        for ( int i = 1; i <= 20; i++){
            for (int j = 1; j<= 20; j++){

                if(i+j == input){
                    System.out.println( i+ " + " +j+ " = " +input);
                }

                if(i-j == input){
                    System.out.println( i+ " - " +j+ " = " +input);
                }
            }
        }
    }
}
