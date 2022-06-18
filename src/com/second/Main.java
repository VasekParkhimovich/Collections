package com.second;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Phone p1 = new Phone("Nokia",5.5,2020,660,24,499.9);
        Phone p2 = new Phone("Apple",6.5,2021,730,48,799.9);
        Phone p3 = new Phone("Samsung",6.0,2022,985,64,999.9);
        Phone p4 = new Phone("Huawei",5.8,2021,810,40,866.8);
        Phone p5 = new Phone("Xiaomi",6.2,2020,780,12,599.8);
        Phone p6 = new Phone("LG",6.7,2021,735,38,801);
        Phone p7 = new Phone("OnePlus",6.7,2022,888,104,1099.7);
        Phone p8 = new Phone("Alcatel",6.3,2021,453,24,520.7);
        Phone p9 = new Phone("HTC",5.9,2019,710,54,899.9);
        Phone p10 = new Phone("Benq",6.1,2022,801,49,959.7);
        Phone p11 = new Phone("Siemens",5.0,2019,425,16,699.9);
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);
        phones.add(p6);
        phones.add(p7);
        phones.add(p8);
        phones.add(p9);
        phones.add(p10);
        phones.add(p11);
        Comparator screenComparator = new ScreenComparator();
        Comparator yearComparator = new YearComparator();
        Comparator proccessorComparator = new ProccessorComparator();
        Comparator cameraComparator = new CameraComparator();
        Collections.sort(phones,proccessorComparator);
        System.out.println(phones);


    }
}




