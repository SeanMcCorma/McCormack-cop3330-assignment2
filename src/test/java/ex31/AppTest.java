package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sean McCormack
 */
class AppTest {

    @Test
    void targetHeartRate() {
        assertEquals("138",App.TargetHeartRate(22,65,0.55));
        assertEquals("191",App.TargetHeartRate(22,65,0.95));
        assertNotEquals("138",App.TargetHeartRate(23,68,0.55));
    }
}