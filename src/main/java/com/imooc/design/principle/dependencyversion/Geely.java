package com.imooc.design.principle.dependencyversion;

/**
 * @Author AsafeXuan
 * @Version 1.0 2020/3/9
 */
public class Geely {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
