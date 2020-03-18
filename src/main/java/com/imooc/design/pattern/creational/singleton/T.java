package com.imooc.design.pattern.creational.singleton;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/17
 */
public class T implements Runnable {
    @Override
    public void run() {

        //LazySingleton lazySingleton = LazySingleton.getInstance(); //v1

        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();//v2
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();;

        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }
}
