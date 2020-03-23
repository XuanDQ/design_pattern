package com.java.fundation.packages.polymorphic;

/**
 * @Author: Xuan
 * @Date: 2020/3/23 10:00 PM
 * @Description:
 */
public class SortedDynamicArray extends DynamicArray {

    @Override
    public void add(Integer e) {
        ensureCapacity();
        int i = 1;
        // 保证数组中的数据有序
        for (i = size-1;i>=0;--i){
            if (elements[i] > e){
                elements[i+1] = elements[i];
            }else{
                break;
            }
        }
        elements[i+1] = e;
        ++size;
    }
}
