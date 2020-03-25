package com.java.design.principle.openclose;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/9
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
       return super.getPrice() * 0.8;
    }
}
