package com.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTourTest {

    KnightTour knight;
    @BeforeEach
    void setUp() {
        knight = new KnightTour();
    }

    @Test
    void testKnight() {
        int [] hotizontal = {2, 2, 1, -2, 1, 1, 2, -1 };
        int [] vertical = { 1, -1, 2, 1, 2, -2, 1, 2 };;
        knight.moveKnight(hotizontal, vertical);
        knight.showBoard();
    }
}