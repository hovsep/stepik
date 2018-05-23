package com.hova;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.print(readAsString(System.in, StandardCharsets.UTF_8));
        } catch (Exception e) {

        }

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = reader.read()) != -1) {
            sb.append(Character.toChars(b));
        }

        return sb.toString();
    }


}
