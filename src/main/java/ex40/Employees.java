package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Employees {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String lastName;
    private String department;
    private String date;

    public Employees(String firstNam, String lastNam, String departmen, String dat)
    {
        firstName = firstNam;
        lastName = lastNam;
        department = departmen;
        date=dat;
    }
    public String print(){
        return String.format("%20s | %20s | %15s",firstName+" "+lastName,department,date);

    }

}
