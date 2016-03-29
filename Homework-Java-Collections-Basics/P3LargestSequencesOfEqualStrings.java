package com.company;

import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 28.3.2016 г..
 */
public class P3LargestSequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split(" ");

        int indexFirstElement = 0;
        int maxLength = 0;

        for (int i = 0; i < words.length; i++) {

            int j = i;
            while( j + 1 < words.length){
                if(words[j].equals(words[j+1]) ){
                    if( (j+1 - i) > maxLength ) {
                        maxLength++;
                        indexFirstElement = i;
                    }
                }else{
                    // going for the next element, this is not equal
                    i = j;
                    break;
                }
                j++;
            }
        }

        for (int i = indexFirstElement; i <= indexFirstElement + maxLength; i++) {

            System.out.print( words[i] + " ");
        }
    }
}
