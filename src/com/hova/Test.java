package com.hova;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = {
                new Animal("Cat"),
                new Animal("Dog"),
                new Animal("Elephant"),
                new Animal("Cock"),
                new Animal("Bull"),
                new Animal("Ant"),
                new Animal("Tentecles"),
                new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
            oos.writeInt(333);
        }
        oos.flush();
        oos.close();

        deserializeAnimalArray(bai.toByteArray());
    }


    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            Animal a;

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            int c = ois.readInt();
            Animal[] res = new Animal[c];

            for (int i = 0; i<c; i++) {
                a = (Animal) ois.readObject();
                res[i] = a;
            }

            return res;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }



}
