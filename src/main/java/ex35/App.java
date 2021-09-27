package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        List<String> names = addNames();
        System.out.println("The winner is.... "+chooseName(names));
    }
    public static List<String> addNames(){
        List<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (1==1){
            System.out.print("Enter a name: ");
            String name = scan.nextLine();
            if(name.length() > 0){
                names.add(name);
            }else{
                return names;
            }
        }
    }
    public static String chooseName(List<String> names){
        return names.get((int)(Math.random()*names.size()));
    }
}
