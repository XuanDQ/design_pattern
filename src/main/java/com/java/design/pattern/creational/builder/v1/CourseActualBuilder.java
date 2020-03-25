package com.java.design.pattern.creational.builder.v1;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/16
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArtical(String courseArtical) {
        course.setCourseArtical(courseArtical);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course ;
    }
}
