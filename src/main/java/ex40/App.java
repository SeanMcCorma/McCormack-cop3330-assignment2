package ex40;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class App {
    public static void main(String [] args){
        Employees[] records = {
                new Employees("John", "Johnson", "Manager","2016-12-31"),
                new Employees("Toa", "Xiong", "Software Engineer","2016-10-05"),
                new Employees("Michaela", "Michaelson", "District Manager","2015-12-19"),
                new Employees("Jake", "Jacobson", "Programmer",""),
                new Employees("Jacquelyn", "Jackson", "DBA",""),
                new Employees("Sally", "Webber", "Web Developer","2015-12-18")
        };
        List<Employees> employee = Arrays.asList(records);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String input = scan.nextLine();
        Comparator<Employees> Alphabetically = Comparator.comparing(Employees::getLastName).thenComparing(Employees::getFirstName);
        employee.sort(Alphabetically);
        System.out.println("\n Results: \n \n");
        System.out.printf("%20s | %20s | %15s\n---------------------|----------------------|-----------------\n","Name", "Postion","Separation Date");
        for(int x=0; x < employee.size(); x++){
            if(employee.get(x).getFirstName().contains(input)){
                System.out.println(employee.get(x).print());
            }else if(employee.get(x).getLastName().contains(input)){
                System.out.println(employee.get(x).print());
            }
        }

    }

    public static void printing (List<Employees> employee){
        System.out.printf("%20s | %20s | %15s\n---------------------|----------------------|-----------------\n","Name", "Postion","Separation Date");
        for(int x = 0; x < employee.size(); x++){
            System.out.println(employee.get(x).print());
        }
        System.out.println();
    }
}
