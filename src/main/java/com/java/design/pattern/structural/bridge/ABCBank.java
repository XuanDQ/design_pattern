package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/30 9:35 下午
 */
public class ABCBank extends Bank {

    ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;

    }
}
