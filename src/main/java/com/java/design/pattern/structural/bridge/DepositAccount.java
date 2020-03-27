package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * 定期账号
 * @date 2020/3/27 5:14 下午
 */
public class DepositAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount() {
        };
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
