package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P1FilterArray {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String[] words = input.split(" ");

        Arrays.stream(words).filter(p -> p.length() > 3).forEach(e -> {System.out.print(e + " "); } );

//        Arrays.stream(words).forEach(e -> { System.out.println(e); } );
//
//        Arrays.stream(words).forEach(System.out::println);

//        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        for (Integer num : nums) {
//            if( isEven().test(num)) {
//                System.out.println(num);
//            }
//        }

//        nums.stream().filter(isEven().negate()).forEach(System.out::println);

//        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
//
//        List<Integer> parsedNumbers = numbers.stream()
//                .map(parseInteger())
//                .collect(Collectors.toList());

//        String hardUni = modifyString("SoftUni", s -> s.replace("Soft", "Hard"));
//        System.out.println(hardUni);
//        String soft = modifyString("SoftUni", s -> s.substring(0, 4));
//        System.out.println(soft);
//        String uppercased = modifyString("SoftUni", String::toUpperCase);
//        System.out.println(uppercased);
    }

    public static Predicate<Integer> isEven(){
        return p -> p % 2 == 0;
    }

    public static Function<String, Integer> parseInteger() {
        return p -> Integer.parseInt(p);
    }

    public static String modifyString(String s, Function<String, String> function) {
        return function.apply(s);
    }
}
