package com.java.design.principle.singleresponsibility;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class CourseImpl implements ICourseContent,ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
