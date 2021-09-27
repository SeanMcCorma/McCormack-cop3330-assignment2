package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
class AppTest {

    @Test
    void validateInput() {
        assertEquals("The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\nThe last name must be filled in.\nThe employee ID must be in the format of AA-1234.\nThe zipcode must be a 5 digit number.", App.validateInput("J","","ABCDE","A12-1234"));
        assertEquals("There were no errors found.", App.validateInput("John","Johnson","55555","TK-4321"));
    }
}