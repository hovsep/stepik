package com.hova;


import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

public class Test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        String input = scanner.nextLine();
        System.out.println("INPUT: " + input);
        String[] words = input.toLowerCase().split("[\\p{Blank}\\p{Punct}]+");
        Map<String, Integer> freqMap = new HashMap<String, Integer>();
        Integer out = 0;


        for (String word: words) {
            if (freqMap.containsKey(word)) {
                freqMap.compute(word, (k,v) -> (v+= 1));
            } else {
                freqMap.put(word, 1);
            }
        }

        freqMap = sortByValue(freqMap);

        freqMap.forEach((k,v) -> {System.out.println(k + " " + v );});


    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

        List<Map.Entry<K, V>> list =
                new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;

    }




}
