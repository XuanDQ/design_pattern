package com.java.design.pattern.structural.proxy.staticproxy;

import com.java.design.pattern.structural.proxy.IOrderService;
import com.java.design.pattern.structural.proxy.Order;
import com.java.design.pattern.structural.proxy.OrderServiceImpl;
import com.java.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 8:39 下午
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    /**
     * 可以不同名，这么写能比较清晰的表示是代理的这个类的这个方法（增强）
     * @param order
     * @return
     */
    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        //设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }


}
