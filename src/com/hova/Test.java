package com.hova;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) {
        String s = "Ы";
        byte[] raw = s.getBytes(StandardCharsets.UTF_8);
        for (byte b:raw) {
            System.out.println(Byte.toUnsignedInt(b));
        }
    }


}
