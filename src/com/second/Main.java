package com.second;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
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



