package com.vytrack.utilities;

public class Sleep {

    public static void waitSecond(int x){

        try {
            Thread.sleep(x*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}