package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maggie on 27.3.2016 г..
 */
public class P5ArraylistOfDoubles {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        list.add(1.3);
        list.add(1.3);
        list.add(1.3);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("doubles.list"));
            outputStream.writeObject(list);
            System.out.println("list: " + list);

            List<Double> noviqList = new ArrayList<>();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("doubles.list"));
            noviqList = (List<Double>) inputStream.readObject();
            System.out.println("noviq list: " + noviqList);

            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
