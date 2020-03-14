package com.imooc.design.principle.openclose;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/8
 * 类似于 serviceImpl的接口实现类
 * 内置属性和构造器赋值免于创建实体类
 */
public class JavaCourse implements ICourse{
    private Integer id;
    private String name;
    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
