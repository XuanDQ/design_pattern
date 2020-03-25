package com.java.design.pattern.creational.builder.v2;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/16
 */
public class Test {
    public static void main(String[] args) {
        //按需调用之后可以链式调用
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();
        System.out.println(course);
    }

}
