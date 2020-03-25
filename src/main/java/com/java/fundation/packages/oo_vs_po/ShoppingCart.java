package com.java.fundation.packages.oo_vs_po;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Xuan
 * @date  2020/3/24 10:52 AM
 * description:
 */

public class ShoppingCart {
    private int itemsCount;
    private double totalPrice;
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemsCount() {
        return this.itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<ShoppingCartItem> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemsCount++;
        totalPrice += item.getPrice();
    }
    // ...省略其他方法...

    //将清空购物车的逻辑封装在这里，透明地给使用者调用。
    public void clear() {
        items.clear();
        itemsCount = 0;
        totalPrice = 0.0;
    }
}
