package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main (String [] args){
        int[][] multiplication=new int[12][12];
        multiplication=multi(multiplication);
        for(int row = 0; row < multiplication.length; row++) {
            for (int col = 0; col < multiplication.length; col++) {
                System.out.printf("%5d", multiplication[row][col]);
            }
            System.out.println();
        }
    }
    public static int[][] multi(int[][] multiplication){
        for(int row = 0; row < multiplication.length; row++){
            for(int col = 0; col < multiplication.length; col++){
                multiplication[row][col]= (row+1)*(col+1);
            }
        }
        return multiplication;
    }
}
