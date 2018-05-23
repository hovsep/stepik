package com.hova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.ENGLISH);
            double sum = 0;

            while (scanner.hasNext()) {
                try {
                    sum += Double.parseDouble(scanner.next());
                } catch (Exception e) {
                }
            }

            System.out.printf("%.6f", sum);

        } catch (Exception e) {
        }

    }



}
