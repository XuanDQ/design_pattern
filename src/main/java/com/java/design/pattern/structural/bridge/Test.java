package com.java.design.pattern.structural.bridge;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/30 9:44 下午
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

//        Bank icbcAccountBank = new ICBCBank(new SavingAccount());
//        Account icbcSavingAccount = icbcAccountBank.openAccount();
//        icbcSavingAccount.showAccountType();
//
//        Bank abcBankSaving = new ABCBank(new SavingAccount());
//        Account abcSavingAccount = abcBankSaving.openAccount();
//        abcSavingAccount.showAccountType();
    }
}
