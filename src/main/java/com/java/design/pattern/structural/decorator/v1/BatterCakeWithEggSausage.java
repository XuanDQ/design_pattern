package com.java.design.pattern.structural.decorator.v1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/20
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
