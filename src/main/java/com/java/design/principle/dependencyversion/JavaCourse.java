package com.java.design.principle.dependencyversion;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/9
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
