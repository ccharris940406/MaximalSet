package com.harris;

import java.util.Iterator;
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
        simple.add(5);
        set.add(simple);

        simple = new MaximalSet();
        simple.add(1);
        simple.add(2);
        simple.add(6);
        set.add(simple);



        //System.out.println(set);

        simple = new MaximalSet();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        simple.add(6);

        set.add(simple);

        simple = new MaximalSet();
        simple.add(1);
        simple.add(2);


        System.out.println(set);
        ((MaximalSet)set).myRemove(simple);
        System.out.println(set);


    }
}
