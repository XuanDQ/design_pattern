package com.java.design.principle.liskovsubstitution;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class Square implements Quadrangle{
    private long sideLength;

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}