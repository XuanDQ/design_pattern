package com.java.design.principle.compositionaggregation;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/10
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
