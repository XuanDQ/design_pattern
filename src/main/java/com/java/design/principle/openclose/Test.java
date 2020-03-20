package com.java.design.principle.openclose;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/8
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(
                96, "Java从0到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;

        //在实际项目中是不允许用sout的，因为有锁。都是用log包打印
        System.out.println("课程id:  " + javaCourse.getId()
                + "课程名称： " + javaCourse.getName()
                + "课程价格：  " + javaCourse.getDiscountPrice()
                + "课程原价： " + javaCourse.getPrice());

    }
}
