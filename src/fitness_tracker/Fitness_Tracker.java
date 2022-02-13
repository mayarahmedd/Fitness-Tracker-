/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness_tracker;

import java.util.Scanner;

/**
 * @author Mayar-PC
 */
public class Fitness_Tracker {

    private static int totalcaloriesburnt;
    private static float totalheartrate;

    private int caloriesburnt;
    private float heartrate;
    private float heartrateincrease;


    private String Activity;
    private int Time;

    private int caloriesburntpermin;
    private float heartrateincreasepermin;


    public Fitness_Tracker(String Activity, int caloriesburntpermin, float heartrateincreasepermin) {

        this.Activity = Activity;
        this.caloriesburntpermin = caloriesburntpermin;
        this.heartrateincreasepermin = heartrateincreasepermin;
        this.totalcaloriesburnt = 0;
        this.totalheartrate = 80;
        this.caloriesburnt = 0;
        this.heartrate = 80;
        this.heartrateincrease = 0;
    }

    public static int getTotalcaloriesburnt() {
        return totalcaloriesburnt;
    }

    public static float getTotalheartrate() {
        return totalheartrate;
    }

    public int getCaloriesburnt() {
        return caloriesburnt;
    }

    public float getHeartrateincrease() {
        return heartrateincrease;
    }

    public String getActivity() {
        return Activity;
    }

    public int getCaloriesburntpermin() {
        return caloriesburntpermin;
    }

    public float getHeartrateincreasepermin() {
        return heartrateincreasepermin;
    }


    public void setTime(int Time) {
        this.Time = Time;
        heartrate = totalheartrate;
        heartratecalculaton(Time);
        Totalburntcalories(Time);
        burntcalories(Time);

    }

    public void heartratecalculaton(int time) {

        this.totalheartrate = (float) (this.totalheartrate + this.totalheartrate * time * this.heartrateincreasepermin);
        heartrateincrease += totalheartrate - heartrate;

    }


    public void Totalburntcalories(int time) {

        this.totalcaloriesburnt = this.totalcaloriesburnt + time * this.caloriesburntpermin;
    }


    public void burntcalories(int time) {

        this.caloriesburnt = this.caloriesburnt + time * this.caloriesburntpermin;
    }


    public static Fitness_Tracker[] Sorting(Fitness_Tracker arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].caloriesburnt < arr[j + 1].caloriesburnt) {
                    // swap temp and arr[i]
                    Fitness_Tracker temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (arr[j].caloriesburnt == arr[j + 1].caloriesburnt
                        && arr[j].heartrateincrease < arr[j + 1].heartrateincrease) {

                    Fitness_Tracker temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        return arr;

    }
}