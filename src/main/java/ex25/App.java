package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a password to determine the strength: ");
        String password = scan.nextLine();

        String strength = passwordValidator(password);
        System.out.println(strength);
    }
    public static String passwordValidator(String password){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|`~';:/?.>,<";

        int num =0;
        int alpha = 0;
        int spec = 0;
        for(int x=0;x<password.length();x++){
            char pass = password.charAt(x);
            if(alphabet.contains(Character.toString(pass))){
                alpha++;
            }else if(numbers.contains(Character.toString(pass))){
                num++;
            }else if(special.contains(Character.toString(pass))){
                spec++;
            }
        }

        if(password.length()<8){
            if(alpha == 0){
                return "The password '"+password+"' is a very weak password.";
            }else{
                return "The password '"+password+"' is a weak password.";
            }
        }else{
            if(num >= 1 && alpha >= 1 && spec >= 1){
                return "The password '"+password+"' is a very strong password.";
            }else if(num > 0){
                return "The password '"+password+"' is a strong password.";
            }
        }
        return "The password '"+password+"' is a very weak password.";
    }


}
