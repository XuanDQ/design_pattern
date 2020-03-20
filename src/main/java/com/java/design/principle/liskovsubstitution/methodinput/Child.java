package com.java.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class Child extends Base{

    @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行");
    }

    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}
