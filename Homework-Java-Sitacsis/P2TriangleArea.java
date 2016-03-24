package com.company;

/**
 * Created by maggie on 18.3.2016 г..
 */
public class P2TriangleArea {

    public static void main(String[] args) {

        java.util.Scanner console = new java.util.Scanner(System.in);

        int ax = console.nextInt();
        int ay = console.nextInt();
        int bx = console.nextInt();
        int by = console.nextInt();
        int cx = console.nextInt();
        int cy = console.nextInt();
        //discarding scanner :)
        console.close();

        //formula for coords
        double rezult = (double)(ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2;
        double area = Math.abs(rezult);

        System.out.println(Math.round(area)); // cast to int or Math.round(), to show whole number
    }
}
