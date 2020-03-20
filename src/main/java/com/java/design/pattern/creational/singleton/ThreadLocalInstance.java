package com.java.design.pattern.creational.singleton;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/19
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE_THREAD_LOCALhreadLocal
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE_THREAD_LOCALhreadLocal.get();
    }
}
