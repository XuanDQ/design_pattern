package com.java.design.pattern.creational.singleton;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/18
 */
public enum EnumInstance {
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("Geely Print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
