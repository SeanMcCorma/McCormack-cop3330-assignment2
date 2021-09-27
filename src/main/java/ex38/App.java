package ex38;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();
        String[] numbers_Str = input.split(" ");
        int[] numbers = new int[numbers_Str.length];
        for(int x = 0; x < numbers_Str.length; x++){
            numbers[x]=Integer.parseInt(numbers_Str[x]);
        }
        System.out.println("The even numbers are"+filterEvenNumbers(numbers)+".");
    }
    public static String filterEvenNumbers(int[] numbers){
        String output = "";
        for(int x =0; x < numbers.length; x++){
            if(numbers[x]%2==0){
                output= output+" "+numbers[x];
            }
        }
        return output;
    }
}
