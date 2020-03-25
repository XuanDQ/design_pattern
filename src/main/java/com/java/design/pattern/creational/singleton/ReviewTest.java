package com.java.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/25 1:42 PM
 */
public class ReviewTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Class obj = ReviewHungrySingleton.class;
        Constructor constructor = obj.getDeclaredConstructor();
        constructor.setAccessible(true);

        ReviewHungrySingleton reviewHungrySingleton = ReviewHungrySingleton.getInstance();


    }
}
