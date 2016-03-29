package com.company;

import java.util.Scanner;

/**
 * Created by DONotwaCHO_o on 28.3.2016 г..
 */
public class P4LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split(" ");
        int longestStartIndex = 0;
        int longestLength = 0;

        System.out.print(words[0] + " ");
        if(words.length>1) {
            for (int i = 1; i < words.length; i++) {

                if (Integer.parseInt(words[i - 1]) < Integer.parseInt(words[i]) ) {
                    System.out.print(words[i] + " ");
                } else {
                    System.out.println();
                    System.out.print(words[i] + " ");
                }
            }


            for (int i = 0; i < words.length; i++) {
                int j = i;
                while( j + 1 < words.length){
                    if(Integer.parseInt(words[j]) < Integer.parseInt(words[j+1]) ){
                        if( (j+1 - i) > longestLength ) {
                            longestLength++;
                            longestStartIndex = i;
                        }
                    }else{
                        // going for the next element, this is not equal
                        i = j;
                        break;
                    }
                    j++;
                }
            }
        }

        System.out.print(System.lineSeparator() + "Longest: ");
        for (int i = longestStartIndex; i <= longestStartIndex + longestLength; i++) {
            System.out.print( words[i] + " ");
        }
    }
}
