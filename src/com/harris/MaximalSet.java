package com.harris;

import java.util.Iterator;
import java.util.TreeSet;

public class MaximalSet extends TreeSet implements Comparable {

    private boolean isSubSet(Object o){

        if(o instanceof Integer){
            return this.contains(o);
        }

        Iterator it = this.iterator();
        for (Iterator iter = it; iter.hasNext(); ) {
            MaximalSet i = ((MaximalSet) iter.next());
            if (i.containsAll(((TreeSet) o))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if(this.isSubSet(o)){
            return false;
        }
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
