package com.java.design.principle.singleresponsibility;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public interface ICourse {
    // 获取课程信息
    String getCourseName();
    byte[] getCourseVideo();

    // 管理课程内容
    void studyCourse();
    void refundCourse();
}
