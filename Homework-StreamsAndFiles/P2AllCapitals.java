package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maggie on 26.3.2016 г..
 */
public class P2AllCapitals {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("lines.txt"));

            List<String> lines = new ArrayList<>();

            String line;
            while ( (line = br.readLine()) != null){
                lines.add(line);
            }
            br.close();

            FileWriter bwr = new FileWriter("lines.txt");
            for (String s : lines) {
                bwr.write(s.toUpperCase() + System.lineSeparator());
            }
            bwr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
