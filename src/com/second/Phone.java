package com.second;

public class Phone implements Comparable<Phone> {
    private String name;
    private double size;
    private int year;
    private int proccessor;
    private int camera;
    private double price;
    Phone(String n,double s, int y, int p, int c, double price){
        this.name=n;
        this.size=s;
        this.year=y;
        this.proccessor=p;
        this.camera=c;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public int getCamera() {
        return camera;
    }

    public int getProccessor() {
        return proccessor;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Phone p){
        return (int)(this.price-p.price);
    }

    public String toString(){
        return "\n"+name + "   Диагональ экрана: "+size+
                "   Год выпуска: "+year+
                "   Процессор:"+proccessor+
                "   Разрешение камеры: "+camera+
                "   Цена: "+price;
    };
}
