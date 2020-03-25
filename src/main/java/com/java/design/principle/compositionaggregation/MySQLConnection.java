package com.java.design.principle.compositionaggregation;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
