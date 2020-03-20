package com.java.design.pattern.creational.factory.abstractfatory;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/16
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Artical getArtical() {
        return new PythonArtical();
    }
}
