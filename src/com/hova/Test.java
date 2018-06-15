package com.hova;


import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Integer i = 0;
        Integer next;

        while (scanner.hasNextInt()) {
            next = scanner.nextInt();
            if (i % 2 != 0) {
                q.add(next);
            }
            i++;
        }

        Iterator<Integer> iterator = q.descendingIterator();

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");
        }



    }







}
