package com.java.design.pattern.creational.factory.abstractfatory;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/16
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Artical getArtical() {
        return new JavaArtical();
    }
}
