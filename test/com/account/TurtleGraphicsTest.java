package com.account;

import com.account.LearnInterface.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {
    TurtleGraphics turtle;
    Pen biro;
    SketchPad pad;

    @BeforeEach
    void setUp() {
        turtle = new TurtleGraphics();
        biro = new Pen();
        turtle.setTurtlePen(biro);
        pad = new SketchPad();
    }

    @Test
    void createTurtle() {
        assertEquals(0, turtle.getXCoordinate());
        assertEquals(0, turtle.getYCoordinate());
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
        assertEquals(CardinalDirection.NORTH, turtle.getDirection());
    }

    @Test
    void moveForwardTest() {
        assertEquals(0, turtle.getXCoordinate());
        assertEquals(0, turtle.getYCoordinate());
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
        turtle.moveForward(7);
        assertEquals(6, turtle.getXCoordinate());
        assertEquals(0, turtle.getYCoordinate());
    }

    @Test
    void putPenDown() {
        assertEquals(PenPosition.UP, turtle.getTurtlePen().getPositionOfThePen());
        turtle.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, turtle.getTurtlePen().getPositionOfThePen());
    }

    @Test
    void draw() {
        int steps = 7;
        turtle.draw(pad.getFloor(), steps);
        for (int i = 0; i < steps; i++) {
            assertEquals(1,pad.getFloor()[0][i]);
        }
    }

    @Test
    void turtleRightWhenFacingNorth() {
        assertEquals(CardinalDirection.NORTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalDirection.EAST, turtle.getDirection());
    }

    @Test
    void turtleRightWhenFacingEast() {
        assertEquals(CardinalDirection.EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(CardinalDirection.SOUTH, turtle.getDirection());
    }

    @Test
    void drawSquare() {
        assertEquals(CardinalDirection.NORTH, turtle.getDirection());
        int steps = 12;
        turtle.draw(pad.getFloor(), steps);

        turtle.turnRight();
        turtle.draw(pad.getFloor(), steps);

        turtle.turnRight();
        turtle.draw(pad.getFloor(), steps);

        turtle.turnRight();
        turtle.draw(pad.getFloor(), steps);

        for (int i = 0; i < pad.getFloor().length; i++) {
            for (int j = 0; j < pad.getFloor().length; j++) {
                if(pad.getFloor()[i][j] == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}