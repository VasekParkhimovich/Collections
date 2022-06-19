package com.second;
import Comparators.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rnd = new Random();
        ArrayList<List> carsList = new ArrayList<List>();
        Comparator carCompare = new CarListComparator();

        for(int u=0;u<35;u++) {
            ArrayList<Car> cars = new ArrayList<>();
            for (int i = 1; i < rnd.nextInt(20); i++) {      // записивыем в список cars рандомное колличество машин
                int power = rnd.nextInt(70, 600);
                double econ = (double) rnd.nextInt(300, 3000) / 100;
                int speed = rnd.nextInt(140, 280);
                int fuelCapacity = rnd.nextInt(40, 100);
                Car c = new Car(String.valueOf(i), power, econ, speed, fuelCapacity);
                cars.add(c);
            }
            carsList.add(u,cars);
        }
        Collections.sort(carsList,carCompare);
        System.out.println(carsList);

    }
}




