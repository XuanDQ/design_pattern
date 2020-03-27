package com.java.design.pattern.structural.adapter;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/27 3:07 下午
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5v();
    }
}
