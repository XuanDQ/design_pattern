package com.java.design.pattern.structural.adapter.objectadapter;

import com.java.design.pattern.structural.adapter.objectadapter.Target;

/**
 * @author safeXuan
 * @version 1.0
 * description：target的具体的实现类
 * @date 2020/3/27 1:46 下午
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("具体目标：ConcreteTarget");
    }
}
