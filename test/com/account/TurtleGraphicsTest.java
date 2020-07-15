package com.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {
    TurtleGraphics turtle;

    @BeforeEach
    void setUp() {
        turtle = new TurtleGraphics();
    }

    @Test
    void testObj() {
        assertNotNull(turtle);

//        turtle.displayBoard();
//        turtle.turnRight();
//        turtle.turnRight();
//        turtle.turnLeft();
        turtle.move(5);
        turtle.turnRight();
        turtle.turnRight();
        turtle.move(10);
        turtle.displayBoard();
    }
}