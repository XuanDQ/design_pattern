package com.java.design.principle.compositionaggregation;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
