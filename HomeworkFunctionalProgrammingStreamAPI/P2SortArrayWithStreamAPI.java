package com.company;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;

/**
 * Created by maggie on 4.4.2016 г..
 */
public class P2SortArrayWithStreamAPI {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String arrInput = console.nextLine();
        String SortingOrder = console.nextLine();

        String[] numString = arrInput.split("\\s+");

//        int[] nums = Arrays.stream(numString).mapToInt(Integer::parseInt).toArray();

        if (SortingOrder.equals("Ascending")){
            Arrays.asList(numString).stream().sorted((p,q) -> p.compareTo(q)).forEach(p -> {
                System.out.print(p + " ");
            });
        } else { // descending
//            Arrays.asList(numString).stream().sorted(Comparator.reverseOrder());
            Arrays.asList(numString).stream().sorted((p,q) -> q.compareTo(p)).forEach(p -> {
                System.out.print(p + " ");
            });
        }
    }
}
