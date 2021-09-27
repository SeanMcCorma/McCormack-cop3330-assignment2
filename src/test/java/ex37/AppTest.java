package ex37;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    List<Character> word = new ArrayList<>(Arrays.asList('8','(','=','1','l','Q','g','J'));
    @Test
    void passwordGenerator() {
    }

    @Test
    void listToString() {
        assertEquals("8(=1lQgJ",App.listToString(word));
    }
}