package com.java.design.pattern.structural.decorator.v2;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/23
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() +2 ;
    }
}
