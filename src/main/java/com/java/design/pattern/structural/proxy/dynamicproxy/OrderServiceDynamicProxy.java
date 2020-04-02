package com.java.design.pattern.structural.proxy.dynamicproxy;

import com.java.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/4/2 10:18 下午
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    /**
     * 反射的方式，所以在创建动态代理类的时候就通过构造方式传入 被代理类
     */
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 给代理类绑定生成的动态代理类，通过newProxyInstance（ ）产生代理类
     * @return
     */
    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterObject();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        // 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("动态代理 before code");
    }

    private void afterObject() {
        System.out.println("动态代理 after code");
    }
}
