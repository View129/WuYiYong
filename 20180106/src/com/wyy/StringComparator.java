package com.wyy;

import java.util.Comparator;
public class StringComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if(((String)o1).compareTo((String) o2)>0){
            return 1;
        }else if(((String)o1).compareTo((String) o2)==0){
            return 0;
        }else {
            return -1;
        }
    }
}
