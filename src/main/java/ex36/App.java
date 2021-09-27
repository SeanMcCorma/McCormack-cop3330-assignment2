package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        List<Integer> numbers = addNums();
        System.out.println(processing(numbers));
    }

    public static List<Integer> addNums(){
        List<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String numbersString = "0123456789";
        while (1==1){
            System.out.print("Enter a number: ");
            String num = scan.nextLine();
            if(num.equals("done")){
                return numbers;
            }else if(numbersString.contains(num)) {
                System.out.println("Invalid input!");
            }else{
                numbers.add(Integer.parseInt(num));
            }
        }
    }
    public static String processing(List<Integer> numbers){
        String output = "Numbers: ";
        for(int x=0; x <numbers.size(); x++){
            output=output+" "+numbers.get(x);
            if(x != numbers.size()-1){
                output=output+",";
            }else{
                output=output+"\n";
            }
        }
        output=output+average(numbers);
        output=output+min(numbers);
        output=output+max(numbers);
        output=output+std(numbers);
        return output;
    }
    public static String average(List<Integer> numbers){
        int total =0;
        for(int x = 0; x < numbers.size(); x++){
            total += numbers.get(x);
        }
        double average = total/numbers.size();
        return "The average is "+average+"\n";
    }
    public static String max(List<Integer> numbers){
        int max =numbers.get(0);
        for (int x = 1; x <numbers.size();x++){
            if (max < numbers.get(x)){
                max = numbers.get(x);
            }
        }
        return "The maximum is "+max+"\n";
    }
    public static String min(List<Integer> numbers){
        int min =numbers.get(0);
        for (int x = 1; x <numbers.size();x++){
            if (min > numbers.get(x)){
                min = numbers.get(x);
            }
        }
        return "The minimum is "+min+"\n";
    }
    public static String std(List<Integer> numbers){
        double std = 0;
        int sum = 0;
        for(int x = 0; x < numbers.size(); x++){
            sum += numbers.get(x);
        }
        double mean = sum/numbers.size();
        for(int x=0; x< numbers.size();x++){
            std += Math.pow(numbers.get(x)-mean, 2);
        }
        std = Math.sqrt(std/numbers.size());
        return "The standard deviation is "+std;
    }
}
