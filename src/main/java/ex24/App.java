package ex24;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String word1=scan.nextLine();
        System.out.print("Enter the second string: ");
        String word2=scan.nextLine();

        if(isAnagramtesting(word1,word2)){
            System.out.println("\""+word1+"\" and \""+word2+"\" are anagrams.\"");
        }else{
            System.out.println("\""+word1+"\" and \""+word2+"\" are not anagrams.\"");
        }

    }

    public static boolean isAnagramtesting(String word1c, String word2c){
        if(word1c.length()==word2c.length()){
            for(int length1 = 0; length1 <word1c.length(); length1++){
                char w1 = word1c.charAt(length1);
                int w2= word2c.indexOf(w1);
                if(w2 == -1){
                    return false;
                }else{
                    word2c = word2c.substring(0,w2)+ word2c.substring(w2+1);
                }
            }
        }
        if(word2c.length()==0){
            return true;
        }
        return false;
    }
}
