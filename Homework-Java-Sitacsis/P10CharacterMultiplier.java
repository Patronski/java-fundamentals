package com.company;

/**
 * Created by maggie on 22.3.2016 г..
 */
public class P10CharacterMultiplier {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        String first = console.nextLine();
        String second = console.nextLine();
        console.close();

        System.out.println(multiplysAscii(first, second));
    }

    private static long multiplysAscii(String first, String second) {
        long rezult = 0;
        String longerString = "";
        if(first.length() > second.length()){
            longerString = first;
        }
        else{
            longerString = second;
        }

        for ( int i = 0; i < Math.max(first.length(), second.length()); i++ ) {
            if(i>= Math.min(first.length(), second.length())){
                rezult += longerString.charAt(i);
            }else {
                rezult += first.charAt(i) * second.charAt(i);
            }
        }
        return rezult;
    }
}
