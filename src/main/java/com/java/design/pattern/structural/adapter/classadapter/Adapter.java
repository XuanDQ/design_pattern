package com.java.design.pattern.structural.adapter.classadapter;

/**
 * @author safeXuan
 * @version 1.0
 * description：这样就通过适配器适配被适配类，来唤起被适配类的方法。
 * 通过调用父类的adaptedRequest来实现了target.
 * @date 2020/3/27 1:47 下午
 */
public class Adapter extends Adapted implements Target {
    @Override
    public void request() {
        super.adaptedRequest();
    }
}
