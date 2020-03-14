package com.imooc.design.pattern.creational.simplefactory;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class JavaVideo extends Video {
    @Override
    public Video produce() {
        System.out.println("录制Java课程视频");
        return null;
    }
}
