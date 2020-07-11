package com.account.LearnInterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void testForNewBrand() {
        car.setBrand("Honda");
        car.sayBrand();
        car.numOfTyres();
    }
}