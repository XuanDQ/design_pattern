package com.java.design.pattern.structural.decorator.v2;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/23
 */
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(" 销售价格："+aBatterCake.cost());
    }
}
