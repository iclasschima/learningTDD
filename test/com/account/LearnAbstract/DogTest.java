package com.account.LearnAbstract;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog bingo;

    @BeforeEach
    void setUp() {
        bingo = new Dog();
    }

    @Test
    void makeSound() {
        bingo.animalSound();
        bingo.numOfLegs();
    }
}