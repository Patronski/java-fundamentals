package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P1SumFiles {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("lines.txt"));

            String line;
            while ( (line = br.readLine()) != null){
                int sumAsci = 0;
                for (Character ch : line.toCharArray()) {
                    sumAsci += ch;
                }
                System.out.println(sumAsci);
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
