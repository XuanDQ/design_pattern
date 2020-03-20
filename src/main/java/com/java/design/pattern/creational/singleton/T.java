package com.java.design.pattern.creational.singleton;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/17
 */
public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }

    void runSingleton() {
        //LazySingleton lazySingleton = LazySingleton.getInstance(); //v1
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();//v2
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }

    void runContainerSingleton() {
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");

        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }
}
