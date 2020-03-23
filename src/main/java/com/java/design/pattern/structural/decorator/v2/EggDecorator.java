package com.java.design.pattern.structural.decorator.v2;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/23
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() +1;
    }
}
