package com.example.analog;

public class Diamond extends Shape {
    private int diagonal1;
    private int diagonal2;
    public Diamond(int x, int y, int diagonal1, int diagonal2) {
        super(x, y);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
}