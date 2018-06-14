package com.hova;

import java.io.Serializable;
import java.util.Objects;

class Animal<X> implements Serializable {
    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}