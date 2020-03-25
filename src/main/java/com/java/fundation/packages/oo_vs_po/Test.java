package com.java.fundation.packages.oo_vs_po;

import java.util.List;

/**
 * @author Xuan
 * @date  2020/3/24 10:58 AM
 * description:
 */
public class Test {
public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    //清空购物车
    //cart.getItems().clear();
    List<ShoppingCartItem> items = cart.getItems();
    items.clear();

    // 依然可以单独修改到list中的每个数据，伪代码
//    cart.add(new ShoppingCartItem(...));
//    List<ShoppingCartItem> items = cart.getItems();
//    ShoppingCartItem item = items.get(0);
//    item.setPrice(19.0); // 这里修改了item的价格属性
}

}
