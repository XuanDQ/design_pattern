package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * 为什么抽象类，要把account引入到bank里， 利用组合的方式实现它的行为（openAccount)
 * @date 2020/3/27 5:17 下午
 */
public abstract class Bank {
    protected Account account;
    Bank(Account account){
        this.account = account;
    }
    //声明成一样的方法名并不是强制的
    abstract Account openAccount();
}
