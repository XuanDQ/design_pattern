package com.java.design.pattern.structural.decorator.v1;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/20
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(" 销售价格："+batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(" 销售价格："+batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(" 销售价格："+batterCakeWithEggSausage.cost());
    }
}
