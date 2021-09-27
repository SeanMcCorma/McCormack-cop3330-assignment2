package ex37;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(scan.nextLine());
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(scan.nextLine());
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(scan.nextLine());
        int characters = length-special-numbers;
        if(characters >= special+numbers){
            System.out.println("Your password is "+listToString(passwordGenerator(characters,special,numbers)));
        }else{
            System.out.println("Error not enough letters.");
        }
    }
    public static List<Character> passwordGenerator(int characters, int special, int numbers){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers_char = "0123456789";
        String special_char = "!@#$%^&*()-_=+[]{}|`~';:/?.>,<";
        List<Character> password = new ArrayList<>();
        int total = characters+special+numbers;
        for(int x =0; x<total; x++){
            int random_amt = 0;
            if(characters > 0){
                random_amt++;
            }if(special> 0){
                random_amt++;
            }if(numbers >0){
                random_amt++;
            }
            double type_double =  Math.random()*random_amt;
            int type = (int)type_double+1;
            if(type == 1){
                if(characters>0){
                    double alpha = Math.random()*alphabet.length();
                    int alph = (int)alpha;
                    password.add(alphabet.charAt(alph));
                    characters--;
                }else if(special > 0){
                    double alpha = Math.random()*special_char.length();
                    int alph = (int)alpha;
                    password.add(special_char.charAt(alph));
                    special--;
                }else{
                    double alpha = Math.random()*numbers_char.length();
                    int alph = (int)alpha;
                    password.add(numbers_char.charAt(alph));
                    numbers--;
                }
            }else if(type == 2){
                if(special > 0){
                    double alpha = Math.random()*special_char.length();
                    int alph = (int)alpha;
                    password.add(special_char.charAt(alph));
                    special--;
                }else{
                    double alpha = Math.random()*numbers_char.length();
                    int alph = (int)alpha;
                    password.add(numbers_char.charAt(alph));
                    numbers--;
                }
            }else if(type == 3){
                double alpha = Math.random()*numbers_char.length();
                int alph = (int)alpha;
                password.add(numbers_char.charAt(alph));
                numbers--;
            }
        }
        return password;
    }

    public static String listToString(List<Character> word){
        String word_return = "";
        for(int x = 0; x < word.size(); x++){
            word_return = word_return+word.get(x);
        }
        return word_return;
    }

}
