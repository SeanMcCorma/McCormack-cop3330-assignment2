package ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {

    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double i = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double p = scan.nextDouble();
        System.out.println("It will take you " + CalculateMonthsUnitlPaidOff(i,b,p)+" months to pay off this card.");
    }
    public static int CalculateMonthsUnitlPaidOff(double i, double b, double p){
        i = i/365/100;
        double n=Math.log1p(b/p*(1-Math.pow(1+i,30)))/Math.log1p(i);
        n=n/-30;
        int months = (int)Math.ceil(n);
        return months;
    }
}
