package com.java.design.pattern.creational.builder.beautydemo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Xuan
 * @date  2020/3/25 9:09 AM
 * description: 资源池配置类
 */
public class ResourcePoolConfig {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 8;

    //资源名称 必填 无默认值
    private String name;

    //最大总资源数量 非必填 8
    private int maxTotal = DEFAULT_MAX_TOTAL;

    //最大空闲资源数量 非必填 8
    private int maxIdle = DEFAULT_MAX_IDLE;

    //最小空闲资源数量
    private int minIdle = DEFAULT_MIN_IDLE;

    /**
     * v1.直接在构造函数中赋值
     * 可配置项增加更多时，这样写会导致代码的可读性和易用性变差。因为参数列表会变的很长。
     */

//    public ResourcePoolConfig(String name, int maxTotal, int maxIdle, int minIdle) {
//        if (StringUtils.isBlank(name)) {
//            throw new IllegalArgumentException("name should not be empty.");
//        }
//        this.name = name;
//
//        if (maxTotal <= 0) {
//            throw new IllegalArgumentException("maxTotal should be positive.");
//        }
//        this.maxTotal = maxTotal;
//
//        if (maxIdle <= 0) {
//            throw new IllegalArgumentException("maxIdle should be positive.");
//        }
//        this.maxIdle = maxIdle;
//
//        if (minIdle <= 0) {
//            throw new IllegalArgumentException("minIdle should be positive.");
//        }
//        this.minIdle = minIdle;
//
//    }

    /**
     * v2.非必填项在构造器中直接赋值
     * 该版本解决不了的问题：
     * 1）如果必填项变多，还是会出现参数过长的问题
     * 2）假设配置项之间有依赖关系，比如设置一个就要设置其他两个；或者有约束关系，比如minIdle要小于等于maxIdle
     * 3) 如果希望是不可变对象，就不能暴露set方法了
     *
     * @param name
     */
    public ResourcePoolConfig(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;
        this.name = name;
    }

    public void setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxTotal should be positive.");
        }
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(int maxIdle) {
        if (maxIdle <= 0) {
            throw new IllegalArgumentException("maxIdle should be positive.");
        }
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(int minIdle) {
        if (minIdle <= 0) {
            throw new IllegalArgumentException("minIdle should be positive.");
        }
        this.minIdle = minIdle;
    }


}
