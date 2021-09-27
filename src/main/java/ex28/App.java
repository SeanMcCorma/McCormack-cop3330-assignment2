package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        int total=adding();
        System.out.println("The total is "+total);
    }

    public static int adding(){
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for(int x = 1; x <= 5;x++){
            System.out.print("Enter a number: ");
            total += Integer.parseInt(scan.nextLine());
        }
        return total;
    }
}
