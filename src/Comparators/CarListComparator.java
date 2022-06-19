package Comparators;

import java.util.ArrayList;
import java.util.Comparator;

public class CarListComparator implements Comparator<ArrayList> {
    public int compare(ArrayList a1, ArrayList a2){
        return a1.size()-a2.size();
    }

}
