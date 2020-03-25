package com.java.fundation.packages.finallydemo;

/**
 * @author Xuan
 * @date  2020/3/24 2:16 PM
 * description:
 */
public class FinallyDemo {
    public String method111() {
        String ret = "hello";
        try {
            return ret;
        } finally {
            ret = "world";
        }
    }
}