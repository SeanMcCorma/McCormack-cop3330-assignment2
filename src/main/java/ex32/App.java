package ex32;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String [] args){
        System.out.println("Let's play Guess the Number! \n");
        Scanner scan = new Scanner(System.in);
        int play_again=0;
        while(play_again==0){
            int x=0;
            int diff=0;
            while(x==0){
                System.out.printf("Enter the difficulty level (1, 2, or 3): ");
                String difficulty = scan.nextLine();
                if(isNumerical(difficulty)){
                    x++;
                    diff=Integer.parseInt(difficulty);
                }else{
                    System.out.println("Please enter a number");
                }
            }
            int guesses=0;
            double cast_num=0;
            switch (diff){
                case 1: cast_num = Math.random()*10;
                    break;
                case 2: cast_num =  Math.random()*100;
                    break;
                case 3: cast_num =  Math.random()*1000;
                    break;
            }
            int number = (int)cast_num+1;
            System.out.print("I have my number. What's your guess? ");
            while (x==1){
                String guess = scan.nextLine();
                if(isNumerical(guess)){
                    guesses++;
                    int user_number = Integer.parseInt(guess);
                    if(user_number==number){
                        System.out.println("You got it in "+guesses+" guesses!");
                        x++;
                    }else if(user_number> number){
                        System.out.print("Too high. Guess again: ");
                    }else{
                        System.out.print("Too low. Guess again: ");
                    }
                }else{
                    System.out.println("Please enter a number");
                }
            }
            System.out.print("\nDo you wish to play again (Y/N)? ");
            String play = scan.nextLine();
            if (!(play.charAt(0)=='y' || play.charAt(0)=='Y')){
                play_again++;
            }
        }
    }


    public static boolean isNumerical(String strnum){
        String numbers="0123456789";
        for(int x=0; x < strnum.length();x++){
            if(!(numbers.contains(strnum.substring(x,x+1)))){
                return false;
            }
        }
        return true;
    }
}
