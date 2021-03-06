package com.java.design.pattern.creational.builder.v1;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/16
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArtical,
                             String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseArtical(courseArtical);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
