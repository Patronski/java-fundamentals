package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by maggie on 27.3.2016 г..
 */
public class P4CopyJPG {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("pic.jpg");
        FileOutputStream fos = new FileOutputStream("my-copied-picture.jpg");

        int buffer = 0;
        while( (buffer = fis.read()) != -1)
        {
            fos.write(buffer);
        }
        // other solution without while !! But a think it cost more memory
//        byte[] buffer = new byte[fis.available()];
//        fis.read(buffer);
//        fos.write(buffer);

        fis.close();
        fos.close();
    }
}
