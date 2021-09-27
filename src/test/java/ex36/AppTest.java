package ex36;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
    void addNums() {
    }

    @Test
    void processing() {
    }
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(100,200,1000,300));


    @Test
    void average() {
        assertEquals("The average is 400.0\n",App.average(numbers));
    }

    @Test
    void max() {
        assertEquals("The maximum is 1000\n",App.max(numbers));
    }

    @Test
    void min() {

        assertEquals("The minimum is 100\n",App.min(numbers));
    }

    @Test
    void std() {
        assertEquals("The standard deviation is 353.5533905932738",App.std(numbers));
    }
}