package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
class AppTest {

    @Test
    void passwordValidator() {
        assertEquals("The password '12345' is a very weak password.",App.passwordValidator("12345"));
        assertEquals("The password 'abcdef' is a weak password.",App.passwordValidator("abcdef"));
        assertEquals("The password 'abc123xyz' is a strong password.",App.passwordValidator("abc123xyz"));
        assertEquals("The password '1337h@xor!' is a very strong password.",App.passwordValidator("1337h@xor!"));
    }
}