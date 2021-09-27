package ex33;

import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your question?\n > ");
        String question = scan.nextLine();
        List<String> list = new ArrayList<>();
        list.add("No");
        list.add("Yes");
        list.add("Maybe");
        list.add("Ask again later");
        System.out.println("\n"+list.get((int)(Math.random()*list.size())));
    }
}
