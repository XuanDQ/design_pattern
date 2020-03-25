package com.java.design.pattern.creational.builder.beautydemo;

/**
 * @author Xuan
 * @date 2020/3/25 9:32 AM
 * @version 1.0
 * description:
 */
public class Test {

    public static void main(String[] args) {
        //v2
//        ResourcePoolConfig config = new ResourcePoolConfig("dbconnectionpool");
//        config.setMaxTotal(16);
//        config.setMaxIdle(8);

        //v3
        BuilderResourcePoolConfig config = new BuilderResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }


}
