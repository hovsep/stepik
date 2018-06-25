package com.hova;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        T max = null;
        T min = null;

        List<T> list= stream.collect(Collectors.toList());

        try {
            max = Collections.max(list, order);
            min = Collections.min(list, order);
        } catch (Exception e) {

        }


        minMaxConsumer.accept(min,max);
    }



}
