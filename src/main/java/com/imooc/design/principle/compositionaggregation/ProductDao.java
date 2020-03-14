package com.imooc.design.principle.compositionaggregation;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/10
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
