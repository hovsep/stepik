package com.hova;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String input = scanner.nextLine();
        String[] words = input.toLowerCase().split("[\\p{Blank}\\p{Punct}]+");


        Map<String, Long> result =
                Arrays.stream(words).collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet()
              .stream()
              .sorted((e1,e2) -> {
                  if (e1.getValue() == e2.getValue()) {
                      return String.CASE_INSENSITIVE_ORDER.compare(e1.getKey(), e2.getKey());
                  } else {
                      return Long.compare(e2.getValue(), e1.getValue());
                  }
              })
              .limit(10)
              .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        finalMap.forEach((s,i) -> System.out.println(s));


    }




}
