package com.second;
import java.util.Comparator;

public class ProccessorComparator implements Comparator<Phone> {
    public int compare(Phone p1, Phone p2){
        return p1.getProccessor()-p2.getProccessor();
    }
}
