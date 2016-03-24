package com.company;

/**
 * Created by maggie on 22.3.2016 г..
 */
public class P8OddAndEvenPairs {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);
        String input = console.nextLine();
        console.close();

        String[] strNumbers = input.split(" ");

        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        if(strNumbers.length % 2 != 0){
            System.out.println("Invalid length");
            return;
        }

        for(int i =0; i <strNumbers.length; i+=2){
            if(numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0){
                System.out.println(numbers[i] + ", " + numbers[i+1] + " -> both are even");
            }
            else if(numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0){
                System.out.println(numbers[i] + ", " + numbers[i+1] + " -> both are odd");
            }
            else{
                System.out.println(numbers[i] + ", " + numbers[i+1] + " -> different");
            }
        }

    }
}
