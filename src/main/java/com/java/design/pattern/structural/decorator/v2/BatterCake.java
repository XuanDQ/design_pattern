package com.java.design.pattern.structural.decorator.v2;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/23
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
