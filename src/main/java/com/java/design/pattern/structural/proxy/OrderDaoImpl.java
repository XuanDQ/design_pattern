package com.java.design.pattern.structural.proxy;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 8:20 下午
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
