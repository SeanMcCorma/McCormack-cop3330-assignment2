package ex34;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
class AppTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void listPrint() {
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        assertEquals("There are 5 employees:\n"+"John Smith\n"+"Jackie Jackson\n"+"Chris Jones\n"+"Amanda Cullen\n"+"Jeremy Goodwin\n",App.listPrint(employees));
    }

    @Test
    void removeEmployee() {
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        List<String> employee_removed = new ArrayList<>();
        employee_removed.add("Jackie Jackson");
        employee_removed.add("Chris Jones");
        employee_removed.add("Amanda Cullen");
        employee_removed.add("Jeremy Goodwin");
        assertEquals(employee_removed,App.removeEmployee(employees,"John Smith"));
    }
}