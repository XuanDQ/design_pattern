package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 *
 * @date 2020/3/27 5:14 下午
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");

    }
}
