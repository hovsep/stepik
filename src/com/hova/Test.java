package com.hova;


import java.util.*;

public class Test {


    public static void main(String[] args) {
       HashSet<Integer> s1 = new HashSet<>();
       HashSet<Integer> s2 = new HashSet<>();
       Set d;

       s1.add(1);
       s1.add(2);
       s1.add(3);

       s2.add(0);
       s2.add(1);
       s2.add(2);

       d = symmetricDifference(s1,s2);

       Iterator<Integer> i = d.iterator();

       while(i.hasNext()) {
           System.out.println(i.next());
       }
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<Integer> d,s1,s2;

        s1 = new HashSet(set1);
        s2 = new HashSet(set2);
        d = new HashSet<>();

        s1.removeAll(set2);
        s2.removeAll(set1);

        d.addAll(s1);
        d.addAll(s2);

        return (Set) d;
    }






}
