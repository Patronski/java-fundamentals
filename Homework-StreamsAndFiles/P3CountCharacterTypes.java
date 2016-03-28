package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maggie on 26.3.2016 г..
 */
public class P3CountCharacterTypes {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("lines.txt"));

            String line;
            int vouels = 0;
            int consonants = 0;
            int punctuation = 0;
            while ( (line = br.readLine()) != null){
                for (Character ch : line.toCharArray()) {

                    switch (ch){
                        case 'a': vouels++; break;
                        case 'e': vouels++; break;
                        case 'i': vouels++; break;
                        case 'o': vouels++; break;
                        case 'u': vouels++; break;
                        case '!': punctuation++; break;
                        case ',': punctuation++; break;
                        case '.': punctuation++; break;
                        case '?': punctuation++; break;
                        default: {
                            if(Character.isLetter(ch)){
                                consonants++; break;
                            }
                        }
                    }
                }
            }
            br.close();
            System.out.println("Vouels: "+ vouels);
            System.out.println("Consonants: "+ consonants);
            System.out.println("Punctuation: "+ punctuation);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
