package com.java.design.pattern.creational.factory.simplefactory;

/**
 * @author safeXuan
 * @version 1.0 2020/3/10
 */
public class JavaVideo extends AbstractVideo {
    @Override
    public AbstractVideo produce() {
        System.out.println("录制Java课程视频");
        return null;
    }
}
