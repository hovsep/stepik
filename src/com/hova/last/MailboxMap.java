package com.hova.last;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class MailboxMap<K,V> extends TreeMap{

    @Override
    public Object get(Object o) {
        if (this.containsKey(o)) {
            return super.get(o);
        } else {
            return Collections.<String>emptyList();
        }

    }
}
