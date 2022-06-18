package com.second;
import Comparators.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PhoneCreator phcr = new PhoneCreator();

        ArrayList<Phone> phones = new ArrayList<Phone>(phcr.create());
        Comparator screenComparator = new ScreenComparator();
        Comparator yearComparator = new YearComparator();
        Comparator proccessorComparator = new ProccessorComparator();
        Comparator cameraComparator = new CameraComparator();
        Collections.sort(phones,proccessorComparator);
        System.out.println(phones);


    }
}




