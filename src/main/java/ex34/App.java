package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String [] args){
        List<String> employees = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        System.out.println(listPrint(employees));
        System.out.print("Enter an employee name to remove: ");
        String remove = scan.nextLine();
        System.out.println("");
        employees = removeEmployee(employees,remove);
        System.out.println(listPrint(employees));
    }
    public static String listPrint(List<String> employees){
        String print = "There are "+employees.size()+" employees:\n";
        for(int x = 0; x < employees.size(); x++){
            print = print + ""+employees.get(x)+"\n";
        }
        return print;
    }
    public static List<String> removeEmployee(List<String> employees, String remove){
        for (int x = 0; x < employees.size(); x++){
            if(employees.get(x).equals(remove)){
                employees.remove(x);
            }
        }
        return employees;
    }
}
