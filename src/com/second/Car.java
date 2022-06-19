package com.second;

public class Car {
    String name;
    int power;
    double econ;
    int speed;
    int fuelCapacity;
    int longTrip;
    Car(String n, int p, double e, int s, int fCap){
        this.name =n;
        this.power = p;
        this.econ=e;
        this.speed = s;
        this.fuelCapacity = fCap;
        this.longTrip=(int)(fCap/e*100);
    }
    public String toString(){
        return "\n"+ name+
                "   Мощность: "+power+"л.с."+
                "   Расход топлива: "+econ+
                "   Максимальная скорость: "+speed+"км/ч"+
                "   Объем бензобака: "+fuelCapacity+"л."+
                "   Дальность хода: "+longTrip+"км.";
    }

}
