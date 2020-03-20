package com.java.design.principle.liskovsubstitution;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
