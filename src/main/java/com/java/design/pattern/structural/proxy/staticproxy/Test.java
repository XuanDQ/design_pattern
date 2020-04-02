package com.java.design.pattern.structural.proxy.staticproxy;

import com.java.design.pattern.structural.proxy.Order;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 8:47 下午
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
