package com.java.design.principle.liskovsubstitution.methodoutput;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
