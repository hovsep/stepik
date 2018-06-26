package com.hova.last;

public interface Sendable<T> {

    String getFrom();
    String getTo();
    T getContent();

}
