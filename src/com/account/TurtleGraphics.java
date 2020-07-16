package com.account;
import java.util.Arrays;

public class TurtleGraphics {
    private int xCoordinate;
    private int yCoordinate;
    private Pen turtlePen;
    private CardinalDirection direction = CardinalDirection.NORTH;

    public void changePenPosition (PenPosition position) {
        turtlePen.setPositionOfThePen(position);
    }

    public void draw(int[][] canvas, int numOfSteps) {
        turtlePen.setPositionOfThePen(PenPosition.DOWN);
        if (direction == CardinalDirection.NORTH) {
            for(int i = 0; i < numOfSteps; i++) {
                canvas[yCoordinate][i] = 1;
            }
            xCoordinate = numOfSteps - 1;
        } else if (direction == CardinalDirection.EAST) {
            for (int i = 0; i < numOfSteps; i++) {
                canvas[i][xCoordinate] = 1;
            }
            yCoordinate = numOfSteps - 1;
        } else if (direction == CardinalDirection.SOUTH) {
            for (int i = numOfSteps - 1; i >= 0; i--) {
                canvas[yCoordinate][i] = 1;
            }
            xCoordinate = xCoordinate - --numOfSteps;
        }  else if (direction == CardinalDirection.WEST) {
            for (int i = numOfSteps - 1; i >= 0; i--) {
                canvas[i][xCoordinate] = 1;
            }
            yCoordinate = yCoordinate - --numOfSteps;
        }

    }

    public CardinalDirection getDirection() {
        return direction;
    }

    public void setDirection(CardinalDirection direction) {
        this.direction = direction;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setTurtlePen(Pen biro) {
        turtlePen = biro;
    }

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public void moveForward(int steps) {
        xCoordinate = steps - 1;
    }

    public void turnRight() {
        if (direction == CardinalDirection.NORTH) {
            direction = CardinalDirection.EAST;
        } else if (direction == CardinalDirection.EAST) {
            direction = CardinalDirection.SOUTH;
        } else if (direction == CardinalDirection.SOUTH) {
            direction = CardinalDirection.WEST;
        } else if (direction == CardinalDirection.WEST) {
            direction = CardinalDirection.NORTH;
        }
    }
}
