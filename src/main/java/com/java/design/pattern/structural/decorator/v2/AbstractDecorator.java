package com.java.design.pattern.structural.decorator.v2;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/23
 */
public class AbstractDecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

   // protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
