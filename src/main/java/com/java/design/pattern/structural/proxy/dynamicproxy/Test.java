package com.java.design.pattern.structural.proxy.dynamicproxy;

import com.java.design.pattern.structural.proxy.IOrderService;
import com.java.design.pattern.structural.proxy.Order;
import com.java.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 10:26 下午
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);

    }
}
