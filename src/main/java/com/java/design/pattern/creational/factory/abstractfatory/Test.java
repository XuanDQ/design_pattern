package com.java.design.pattern.creational.factory.abstractfatory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/16
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Artical artical = courseFactory.getArtical();
        video.produce();
        artical.produce();
    }
}
