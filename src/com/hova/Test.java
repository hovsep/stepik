package com.hova;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) {
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);

        try {
            writer.write("Ы");
            writer.flush();
        } catch (Exception e) {

        }

    }


}
