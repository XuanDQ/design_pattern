package com.java.design.pattern.creational.builder.v1;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/16
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArtical;

    //question & answer
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArtical() {
        return courseArtical;
    }

    public void setCourseArtical(String courseArtical) {
        this.courseArtical = courseArtical;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArtical='" + courseArtical + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
