package com.java.design.pattern.creational.factory.simplefactory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
abstract class AbstractVideo {
    /**
     * 制作视频方法
     * @return Video
     */
    public abstract AbstractVideo produce();
}
