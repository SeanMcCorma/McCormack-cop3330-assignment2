package ex27;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first_name = scan.nextLine();
        System.out.print("Enter the last name: ");
        String last_name = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String ID = scan.nextLine();
        System.out.println(validateInput(first_name,last_name,zip,ID));
    }


    public static String validateInput(String first_name, String last_name, String zip, String ID){
        String back="";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        if(!(first_name.length() > 1)){
            back = back + "The first name must be at least 2 characters long.\n";
        }
        if(first_name.equals("")){
            back = back +"The first name must be filled in.\n";
        }
        if(!(last_name.length() > 1)){
            back = back + "The last name must be at least 2 characters long.\n";
        }
        if(last_name.equals("")){
            back = back + "The last name must be filled in.\n";
        }
        //fix
        if(ID.length()==7){
            if(!(alphabet.contains(ID.substring(0,1)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(alphabet.contains(ID.substring(1,2)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(ID.substring(2,3).contains("-"))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(numbers.contains(ID.substring(3,4)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(numbers.contains(ID.substring(4,5)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(numbers.contains(ID.substring(5,6)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }else if(!(numbers.contains(ID.substring(6)))){
                back = back +"The employee ID must be in the format of AA-1234.\n";
            }
        }else{
            back = back +"The employee ID must be in the format of AA-1234.\n";
        }
        if(zip.length()==5){
            for(int x = 0; x < zip.length();x++){
                if(!(numbers.contains(zip.substring(x,x+1)))){
                    back = back+"The zipcode must be a 5 digit number.";
                    x =zip.length();
                }
            }
        }

        if(back.equals("")){
            back = "There were no errors found.";
        }
        return back;
    }
}
