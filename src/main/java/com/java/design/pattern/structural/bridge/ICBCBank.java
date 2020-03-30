package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/30 9:36 下午
 */
public class ICBCBank extends Bank {
    ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        // 这样才是真正委托给它执行，很容易忘记；
        // 不要把具体的实现都自己完成，委托给Account来实现，否则创建相同名字的方法就没有意义了。
        // 因为只有通过具体的委托，扩展时bank是不用动的，不要把具体的实现挪到openAccount里，一定把具体的行为委托出去。
        account.openAccount();
        return account;
    }
}
