package com.java.design.pattern.creational.factory.simplefactory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class PythonVideo extends AbstractVideo {
    @Override
    public AbstractVideo produce() {
        System.out.println("录制Python课程视频");
        return null;
    }
}
