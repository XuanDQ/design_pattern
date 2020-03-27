package com.java.design.pattern.structural.adapter.objectadapter;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/27 2:12 下午
 */
public class Adapter implements Target {
    private Adapted adapted = new Adapted();

    @Override
    public void request() {
        adapted.adaptedRequest();
    }
}
