package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/27 5:11 下午
 */
public interface Account {
    /**
     * 打开账号（哪个银行）
     * @return Account
     */
    Account openAccount();

    /**
     * 看账号类型
     */
    void showAccountType();
}
