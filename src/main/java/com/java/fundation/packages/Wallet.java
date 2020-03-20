package com.java.fundation.packages;

import java.math.BigDecimal;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/19
 * 从业务角度分析，id,createTime在创建钱包的时候就确定好了，之后不应该被改动。所以不暴露这两个属性的任何修改方法。
 */
public class Wallet {
    private long id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    public Wallet() {
        this.id = IDGenerator.generateID();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public long getId() {
        return id;
    }

    public long getCreatTime() {
        return createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getBalanceLastModifiedTime() {
        return balanceLastModifiedTime;
    }

    public void increaseBalance(BigDecimal increaseAmount) throws InvalidAmountException {
        if (increaseAmount.compareTo(BigDecimal.ZERO) <0){
            throw new InvalidAmountException("...");
        }
        this.balance.add(increaseAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreaseAmount) throws InvalidAmountException {
        if (decreaseAmount.compareTo(BigDecimal.ZERO) <0){
            throw new InvalidAmountException("...");
        }
        if (decreaseAmount.compareTo(BigDecimal.ZERO) >0){
            throw new InvalidAmountException("...");
        }
        this.balance.add(decreaseAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

}
