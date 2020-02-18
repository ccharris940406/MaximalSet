package com.harris;

import java.util.Iterator;
import java.util.TreeSet;

public class MaximalSet extends TreeSet implements Comparable {

    public boolean isSubSet(Object o){

        Iterator it = this.iterator();

        for (Iterator iter = it; iter.hasNext(); ) {
            TreeSet i = (TreeSet) iter.next();
            System.out.println(i);
        }
        return false;
    }

    @Override
    public boolean add(Object o) {

        return super.add(o);
    }

    @Override
    public int compareTo(Object o) {
        Integer result = Integer.compare(this.size(), ((MaximalSet)o).size());

        if(result == 0){
            Integer a = 0, b = 0;
            Iterator<Integer> it_this = this.iterator();
            Iterator<Integer> it_o    = ((MaximalSet)o).iterator();

            while (it_this.hasNext()){

                Integer aux_a = new Integer(it_this.next());
                Integer aux_b = new Integer(it_o.next());

                a += aux_a*aux_a;
                b += aux_b*aux_b;

            }
            result = Integer.compare(a, b);
        }
        return result;
    }

}
