package com.second;

import java.util.*;

public class MyHashMap {
    MyHashMap(){
        HashMap<Integer,String> hm = new HashMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>(hm);

        hm.put(1,"Peugeot");
        hm.put(2,"Opel");
        hm.put(3,"Lada");
        hm.put(4,"Lamborgini");
        hm.put(5,"Mercedes");
        hm.put(6,"BMW");
        hm.put(7,"Dodge");
        hm.put(9,"Maserati");

        hm.replace(3,"Tesla");
        hm.remove(7);
        hm.remove(9,"Scenic");


        System.out.println(hm2);
        hm2.putAll(hm);
        System.out.println(hm2);

        hm2.put(5,"Renault");
        hm2.put(6,"Ford");
        hm2.put(7,"Jeep");
        hm2.put(8,"Audi");
        hm2.put(9,"VW");
        hm2.put(10,"Porsche");
        System.out.println(hm2);

        List ar = new ArrayList(hm2.values());

        Set mapSet = hm2.entrySet();
        Iterator setIt = mapSet.iterator();
        Iterator arIt = ar.iterator();
        HashMap hm3 = new HashMap();
        hm3 = (HashMap) hm2.clone();
        System.out.println(mapSet);


        boolean b = hm.isEmpty();

        String str = b?"True":"False";// тернарный оператор
        System.out.println(str);

    }
}
