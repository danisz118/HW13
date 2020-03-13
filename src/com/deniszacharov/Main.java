package com.deniszacharov;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        int value = Stream.of(1,2).min(Comparator.comparing(x->x)).get();



        // write your code here
    }
}
