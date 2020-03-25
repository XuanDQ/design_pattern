package com.java.design.pattern.creational.singleton;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/25 1:38 PM
 */
public class ReviewHungrySingleton {
    private final static ReviewHungrySingleton instance;

    static {
        instance = new ReviewHungrySingleton();
    }

    private ReviewHungrySingleton() {
        if (instance != null){
            throw new RuntimeException("...");
        }
    }

    public static ReviewHungrySingleton getInstance() {
        return instance;

    }

    private Object readResolve() {
        return instance;
    }


}
