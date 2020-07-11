package com.account.LearnInheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Samuel samuel;
    Person person;

    @BeforeEach
    void setUp() {
        samuel = new Samuel();
    }

    @Test
    void printIntroduction () {
        samuel.introduction();
        samuel.sayAge(20);
    }
}