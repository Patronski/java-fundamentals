package com.company;

import java.io.*;

/**
 * Created by maggie on 27.3.2016 г..
 */
public class P6SaveACustomObjectInAFile {

    public static void main(String[] args) {
        Course obj = new Course("s", 1);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("course.save"));
            objectOutputStream.writeObject(obj);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("course.save"));
            Course newObj = (Course) objectInputStream.readObject();
            newObj.print();

            objectOutputStream.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

