package com.java.design.pattern.structural.proxy;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 8:19 下午
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，我们课程中就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
