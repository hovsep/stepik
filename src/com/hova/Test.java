package com.hova;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        InputStream test = new ByteArrayInputStream(new byte[] {0x33, 0x45, 0x01});

        try {
            System.out.println(checkSumOfStream(test));
        } catch (Exception e) {
            System.out.println("AAAAArh!" + e.getMessage());
        }

    }


    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        try {
            int p = 0,n;

            while ((n = inputStream.read()) != -1) {
               if (0 == p) {
                   p = Integer.rotateLeft(0,1)^n;
               } else {
                   p = Integer.rotateLeft(p,1)^n;
               }
            }

            return p;
        } catch (Exception e) {
            throw e;
        }
    }

}
