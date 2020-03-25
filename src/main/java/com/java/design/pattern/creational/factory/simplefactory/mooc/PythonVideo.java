package com.java.design.pattern.creational.factory.simplefactory.mooc;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class PythonVideo extends Video {
    @Override
    public Video produce() {
        System.out.println("录制Python课程视频");
        return null;
    }
}
