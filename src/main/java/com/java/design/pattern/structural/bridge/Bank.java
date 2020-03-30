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

    //这个方法和account里的接口方法是一样的，
    // bank里面的具体方法要委托给account里面的openAccount()
    // 所以声明成一样的方法名，不是一样的也ok
    abstract Account openAccount();

}
