package com.java.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
