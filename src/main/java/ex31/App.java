package ex31;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(scan.nextLine());
        System.out.print("Please enter your resting pulse: ");
        int resting = Integer.parseInt(scan.nextLine());
        System.out.printf("\n\n\nResting Pulse: %-10d Age: %d\n\n%-10s | %-6s\n",resting,age,"Intensity","Rate");
        System.out.println("-----------|------");
        for(double x=0.55; x <=0.96;x=x+0.05){
            String intensity = ""+(int)(x*100)+"%";
            System.out.printf("%-10s | %-6s\n",intensity,TargetHeartRate(age,resting,x));
        }
    }

    public static String TargetHeartRate(int age, int restingHr, double intensity){
        double target = (((220-age)- restingHr)*intensity)+restingHr;
        int tar_return = (int)(Math.round(target));
        return ""+tar_return;
    }
}
