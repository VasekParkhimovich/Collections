package com.second;

public class MyObj {
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
