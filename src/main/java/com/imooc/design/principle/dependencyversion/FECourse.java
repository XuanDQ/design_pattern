package com.imooc.design.principle.dependencyversion;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/9
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习FE课程");
    }
}
