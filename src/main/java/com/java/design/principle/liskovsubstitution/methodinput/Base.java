package com.java.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}