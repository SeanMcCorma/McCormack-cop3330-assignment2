package ex29;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int x =1;
        int rateOfReturn=0;
        String numbers = "123456789";
        while (x==1){
            System.out.print("What is the rate of return? ");
            String rate = scan.nextLine();
            int y=0;
            for(int xx=0; xx < rate.length();xx++){
                if(!(numbers.contains(""+rate.substring(xx,xx+1)))){

                }else{
                    y++;
                }
                if(xx+1==rate.length()){
                    if(y==rate.length()){
                        x=0;
                        rateOfReturn = Integer.parseInt(rate);
                    }
                }
            }
            if(x != 0){
                System.out.println("Sorry. That's not a valid input.");
            }

        }
        System.out.println("It will take "+yearsPerReturn(rateOfReturn)+" years to double your initial investment.");
    }
    public static int yearsPerReturn(int rate){
        return 72/rate;
    }
}
