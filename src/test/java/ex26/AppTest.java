package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
class AppTest {

    @Test
    void calculateMonthsUnitlPaidOff() {
        assertEquals(70,App.CalculateMonthsUnitlPaidOff(12,5000,100));
    }
}