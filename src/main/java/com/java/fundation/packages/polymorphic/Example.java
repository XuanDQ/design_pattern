package com.java.fundation.packages.polymorphic;

/**
 * @Author: Xuan
 * @Date: 2020/3/23 10:06 PM
 * @Description:
 */
public class Example {
    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i = 0; i < dynamicArray.size; ++i) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new SortedDynamicArray();
        test(dynamicArray);
    }
}
