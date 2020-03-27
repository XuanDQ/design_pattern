package com.java.design.pattern.structural.adapter.classadapter;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/27 1:57 下午
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        // adapter实现了target接口
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
