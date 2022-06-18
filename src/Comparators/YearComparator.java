package Comparators;
import com.second.Phone;

import java.util.Comparator;

public class YearComparator implements Comparator<Phone> {
    public int compare(Phone p1, Phone p2){
        return p1.getYear()-p2.getYear();
    }
}
