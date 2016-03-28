package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by maggie on 27.3.2016 г..
 */
public class P7CreateZipArchive {

    public static void main(String[] args) {

        try {
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("text-files.zip"));

            ZipEntry wordsEntry = new ZipEntry("words.txt");
            zip.putNextEntry(wordsEntry);

            FileInputStream wordsFis = new FileInputStream("words.txt");
            int iBytes;
            while ( (iBytes = wordsFis.read()) != -1 ){
                zip.write(iBytes);
            }


            ZipEntry countCharsEntry = new ZipEntry("count-chars.txt");
            zip.putNextEntry(countCharsEntry);

            FileInputStream countCharsFis = new FileInputStream("count-chars.txt");
            iBytes = 0;
            while ( (iBytes = countCharsFis.read()) != -1 ){
                zip.write(iBytes);
            }


            ZipEntry linesEntry = new ZipEntry("lines.txt");
            zip.putNextEntry(linesEntry);

            FileInputStream linesFis = new FileInputStream("lines.txt");
            iBytes = 0;
            while ( (iBytes = linesFis.read()) != -1 ){
                zip.write(iBytes);
            }

            zip.closeEntry();
            zip.close();
            linesFis.close();
            countCharsFis.close();
            wordsFis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
