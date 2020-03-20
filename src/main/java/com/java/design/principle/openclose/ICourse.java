package com.java.design.principle.openclose;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/8
 * 查询课程信息接口，类似于 Service 接口
 */
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
}
