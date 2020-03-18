package com.imooc.design.pattern.creational.singleton;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/18
 */
public enum  EnumInstance
{
    INSTANCE;
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
