package com.KamathInc;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);

        int days;

        System.out.println("Enter min power");
        int minPower = s.nextInt();

        System.out.println("Enter no of days");
        days = s.nextInt();


        int powerEachDay[] = new int[days];
        System.out.println("Enter each day");
        for (int i = 0; i < days ; i++){
            powerEachDay[i] = s.nextInt();
        }
        int powerDifs = 0;
       for ( int i =0 ;i < (powerEachDay.length -1) ; i++) {
            if ((i + 1) > powerEachDay.length) {
                System.out.println("out of bounds");
            } else {
                if ((powerEachDay[i] + powerEachDay[i + 1]) < minPower) {
                    int powerDif = minPower - (powerEachDay[i] + powerEachDay[i + 1]);

                    if (powerEachDay[i] < powerEachDay[i + 1]) {
                        powerDifs += powerDif;
                        powerEachDay[i] = powerEachDay[i] + powerDif;
                    } else {
                        powerEachDay[i + 1] = powerEachDay[i + 1] + powerDif;
                        powerDifs += powerDif;

                    }
                }
            }
        }
        System.out.println("New array");
        for (int i =0 ;i < powerEachDay.length ;i++){
            System.out.println(powerEachDay[i]);
        }
        System.out.println("Power difference "+powerDifs);
    }
}
