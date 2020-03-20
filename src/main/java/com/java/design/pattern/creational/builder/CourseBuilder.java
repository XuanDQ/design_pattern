package com.java.design.pattern.creational.builder;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/16
 */
public abstract class CourseBuilder {

    // 抽象方法放在这里就是要交给子类来实现的
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArtical(String courseArtical);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
