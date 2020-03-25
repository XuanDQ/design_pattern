package com.java.design.principle.compositionaggregation;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
