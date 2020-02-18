package com.harris;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set< Set<Integer> > set = new MaximalSet();

        Set<Integer> simple = new MaximalSet();
        simple.add(1);
        simple.add(2);
        simple.add(3);

        set.add(simple);
        simple = null;

        simple = new MaximalSet();
        simple.add(1);
        simple.add(2);

        set.add(simple);

        System.out.println(set);
    }
}
