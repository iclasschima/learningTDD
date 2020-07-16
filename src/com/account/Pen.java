package com.account;


public class Pen {
    private PenPosition positionOfThePen;

    public Pen() {
        positionOfThePen = PenPosition.UP;
    }

    public void setPositionOfThePen(PenPosition position) {
        positionOfThePen = position;
    }

    public PenPosition getPositionOfThePen() {
        return positionOfThePen;
    }
}
