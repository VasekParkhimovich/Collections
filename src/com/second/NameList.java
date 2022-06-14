package com.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NameList {
    NameList(){
        try {
            int id =0; // добавил переменную для инскремента.

            ArrayList<MyObj> objList = new ArrayList<MyObj>();
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

            while (itName.hasNext()) { // убрал лишний цикл.
                id++;
                String str = (String) itName.next();
                objList.add(new MyObj(str, id));

            }
            Iterator itShow = objList.iterator();

            while (itShow.hasNext()) { // И здесь убрал лишний цикл
                    MyObj a = (MyObj) itShow.next();
                    a.show();
            }
        }catch(NoSuchElementException e){
            System.out.println("Error "+ e);
        }

    }
}
