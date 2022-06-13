package com.second;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        new MyHashMap();

    }
}
class MyObj{
    static int count = 0;
    int num;
    String name;
    MyObj(String name, int num){
        this.name = name;
        this.num = num;
        count++;
    }
    void show(){
        System.out.println("Имя обьекта номер "+num+":"+name+".");
    }
}
class NameList{
    NameList(){
        try {
            ArrayList<MyObj> list = new ArrayList<MyObj>();
            ArrayList<String> nameList = new ArrayList<String>();
            nameList.add("Василий");
            nameList.add("Дмитрий");
            nameList.add("Ростислав");
            nameList.add("Татьяна");
            nameList.add("Анастасия");
            nameList.add("Юлия");
            System.out.println(nameList.size());

            Iterator itName = nameList.iterator(); /* проходим итератером по списку имен, добавляем полученный обьект в str, а str добавляем в конструктор.
            Также в конструктор добавляется перменная i,
            благодаря которой в тексте появляется номер обьекта
             */
            while (itName.hasNext()) {
                for (int i=1;i<(nameList.size())+1; i++) {
                    String str = (String) itName.next();
                    list.add(new MyObj(str, i));
                }
            }
            Iterator itShow = list.iterator();
            for (int i = 1; i <list.size()+1; i++) {
                while (itShow.hasNext()) {
                    MyObj a = (MyObj) itShow.next();
                    a.show();
                }
            }
        }catch(NoSuchElementException e){
            System.out.println("Error "+ e);
        }

    }
}
class MyHashMap{
    MyHashMap(){
        HashMap<Integer,String> hm = new HashMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>(hm);

        hm.put(1,"Peugeot");
        hm.put(2,"Opel");
        hm.put(3,"Lada");
        hm.put(4,"Lamborgini");
        hm.put(5,"Mercedes");
        hm.put(6,"BMW");

        hm.replace(3,"Tesla");

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

        String str = b?"True":"False";
        System.out.println(str);

    }
}




