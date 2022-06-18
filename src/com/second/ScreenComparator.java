package com.second;
import java.util.Comparator;

public class ScreenComparator implements Comparator<Phone>{
    public int compare(Phone p1, Phone p2){
        return Double.compare(p1.getSize(),p2.getSize()) ;
    }

}
