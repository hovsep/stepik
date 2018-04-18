package com.hova;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        ByteArrayInputStream ti = new ByteArrayInputStream(new byte[] {65,13, 10, 10, 13});
        try {
            int b = 0 ;
            boolean f = false;

            while ((b = ti.read()) != -1) {

                if (f) {
                    if (b == 10) {
                        System.out.println(10);
                        f = false;
                        continue;
                    } else {
                        System.out.println(13);
                    }

                }



                if (b == 13) {
                    f = true;
                } else {
                    System.out.println(b);
                    f = false;
                }

            }

            if (f) {
                System.out.println(13);
            }

            System.out.flush();

        } catch (Exception e) {

        }
    }

}
